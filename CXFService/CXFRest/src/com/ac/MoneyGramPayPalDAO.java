package com.ac;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.log4j.Logger;

import com.mgi.paypal.inputbean.CommitTransactionInputBean;
import com.mgi.paypal.util.FeeLinkValues;
import com.mgi.paypal.util.HistoryDetails;
import com.mgi.paypal.util.HistoryStatusReverseBean;
import com.mgi.paypal.util.PropertyUtil;

public class MoneyGramPayPalDAO {

	public MoneyGramPayPalDAO() {

	}

	PropertiesConfiguration constantFromProperties = new PropertyUtil()
			.getConstantPropertyConfig();
	private static Logger LOGGER = Logger.getLogger(MoneyGramPayPalDAO.class);

	public void updateFeeFeeDetailTable(BigDecimal upperLimit,
			BigDecimal feeCharge, boolean fundsIn)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter updateFeeFeeDetailTable.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));

		String strQuery = constantFromProperties
				.getString("UPDATE_FEE_DETAIL_QUERY");
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setBigDecimal(1, feeCharge);
		preparedStatement.setBigDecimal(2, upperLimit);
		if (fundsIn) {
			preparedStatement.setString(3, "Fund_In");
		} else {
			preparedStatement.setString(3, "Fund_Out");
		}
		preparedStatement.executeUpdate();
		connection.close();

		LOGGER.debug("Exit updateFeeFeeDetailTable.");
	}

	public FeeLinkValues selectFromFeeDetailTable()
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter selectFromFeeDetailTable.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));

		String strQuery = constantFromProperties
				.getString("SELECT_FEE_DETAIL_QUERY");
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		ResultSet resultSet = preparedStatement.executeQuery();
		BigDecimal feeForTwoHundred = null;
		BigDecimal feeForFiveHundred = null;
		while (resultSet.next()) {
			BigDecimal upperLimit = resultSet.getBigDecimal("UPPER_LIMIT");
			if (upperLimit.compareTo(new BigDecimal(200)) == 0) {
				feeForTwoHundred = resultSet.getBigDecimal("FEE_CHARGES");
			} else {
				feeForFiveHundred = resultSet.getBigDecimal("FEE_CHARGES");
			}
		}
		FeeLinkValues feeLinkValues = new FeeLinkValues();
		feeLinkValues.setFeeForFiveHundred(feeForFiveHundred);
		feeLinkValues.setFeeForTwoHundred(feeForTwoHundred);

		LOGGER.debug("Exit selectFromFeeDetailTable.");

		return feeLinkValues;
	}

	public List<HistoryDetails> retrieveHistroyDetails(String emailId)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter retrieveHistroyDetails.");

		LOGGER.debug("emailId for retrive History  : " + emailId);

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));

		String strQuery = constantFromProperties
				.getString("RETRIEVE_HISTORY_DETAILS_QUERY");
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, emailId);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		while (resultSet.next()) {
			HistoryDetails historyDetails = new HistoryDetails();
			historyDetails.setCustomerEmail(resultSet.getString("CUST_EMAIL"));
			historyDetails.setCustomerName(resultSet.getString("CUST_NAME"));
			historyDetails.setCustomerPhone(resultSet.getString("CUST_PHONE"));
			historyDetails.setMgiReferenceNumber(resultSet
					.getString("MGI_REF_NUM"));
			historyDetails.setPaypalTransactionID(resultSet
					.getString("PAYPAL_TRAN_ID"));
			historyDetails.setTransactionAmount(resultSet
					.getBigDecimal("TRAN_AMT"));
			historyDetails.setTransactionFee(resultSet
					.getBigDecimal("TRAN_FEE"));
			historyDetails.setTransactionID(resultSet.getBigDecimal("TRAN_ID"));
			historyDetails.setTransactionStatus(resultSet
					.getString("TRAN_STATUS"));
			Date transactionDate = resultSet.getDate(("TRAN_DATE"));
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			historyDetails.setTransactionDate(df.format(transactionDate));
			historyDetails.setMgiTransactionSessionID(resultSet
					.getString("MGI_SESS_ID"));
			historyDetailsList.add(historyDetails);

		}

		LOGGER.debug("Exit retrieveHistroyDetails.");

		return historyDetailsList;
	}

	public List<HistoryDetails> retrieveHistroyDetailsForBatchProcess()
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter retrieveHistroyDetails.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));

		String strQuery = constantFromProperties
				.getString("RETRIEVE_HISTORY_DETAILS_FOR_BATCH_QUERY");
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		// preparedStatement.setString(1, emailId);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		while (resultSet.next()) {
			HistoryDetails historyDetails = new HistoryDetails();
			historyDetails.setCustomerEmail(resultSet.getString("CUST_EMAIL"));
			historyDetails.setCustomerName(resultSet.getString("CUST_NAME"));
			historyDetails.setCustomerPhone(resultSet.getString("CUST_PHONE"));
			historyDetails.setMgiReferenceNumber(resultSet
					.getString("MGI_REF_NUM"));
			historyDetails.setPaypalTransactionID(resultSet
					.getString("PAYPAL_TRAN_ID"));
			historyDetails.setTransactionAmount(resultSet
					.getBigDecimal("TRAN_AMT"));
			historyDetails.setTransactionFee(resultSet
					.getBigDecimal("TRAN_FEE"));
			historyDetails.setTransactionID(resultSet.getBigDecimal("TRAN_ID"));
			historyDetails.setTransactionStatus(resultSet
					.getString("TRAN_STATUS"));
			Date transactionDate = resultSet.getDate(("TRAN_DATE"));
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			historyDetails.setTransactionDate(df.format(transactionDate));
			historyDetails.setMgiTransactionSessionID(resultSet
					.getString("MGI_SESS_ID"));
			historyDetailsList.add(historyDetails);

		}

		LOGGER.debug("Exit retrieveHistroyDetails.");

		return historyDetailsList;
	}

	public void insertHistoryDetails(
			CommitTransactionInputBean commitTransactionInputBean)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter insertHistoryDetails.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));
		String strQuery = null;
		strQuery = constantFromProperties
				.getString("INSERT_HISTORY_DETAILS_QUERY");

		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, commitTransactionInputBean
				.getCustomerEmail().toLowerCase());
		preparedStatement.setString(2,
				commitTransactionInputBean.getCustomerName());
		preparedStatement.setString(3,
				commitTransactionInputBean.getCustomerPhoneNumber());
		preparedStatement.setString(4,
				commitTransactionInputBean.getPaypalTransactionID());
		preparedStatement.setString(5,
				commitTransactionInputBean.getMgiReferenceNumber());
		java.util.Date sysDate = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(sysDate.getTime());
		preparedStatement.setDate(6, sqlDate);
		preparedStatement.setBigDecimal(7,
				commitTransactionInputBean.getTransactionAmount());
		preparedStatement.setBigDecimal(8,
				commitTransactionInputBean.getTransactionFee());
		preparedStatement.setString(9,
				commitTransactionInputBean.getMgiTransactionStatus());
		preparedStatement.setString(10,
				commitTransactionInputBean.getPayPalTransactionStatus());
		preparedStatement.setString(11,
				commitTransactionInputBean.getMgiTransactionSessionID());

		preparedStatement.execute();
		connection.close();

		LOGGER.debug("Exit insertHistoryDetails.");

	}

	public void updateHistoryDetail(String mgiTransactionStatus,
			String mgiReferenceNumber, String customerEmail)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter updateHistoryDetail.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));

		String strQuery = constantFromProperties
				.getString("UPDATE_HISTORY_DETAIL");
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, mgiTransactionStatus);
		preparedStatement.setString(2, mgiReferenceNumber);
		preparedStatement.setString(3, customerEmail);
		preparedStatement.executeUpdate();
		connection.close();

		LOGGER.debug("Exit updateHistoryDetail.");
	}

	public void updateHistoryDetailAfterCommitTransaction(
			String payPalTransactionStatus, String paypalTransactionID,
			String mgiTransactionSessionID) throws ClassNotFoundException,
			SQLException {

		LOGGER.debug("Enter updateHistoryDetail.");
			Class.forName("oracle.jdbc.OracleDriver");
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection connection = DriverManager.getConnection(
					constantFromProperties.getString("ORACLE_DB_URL"),
					constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
					constantFromProperties.getString("ORACLE_DB_PASSWORD"));

			// String strQuery = constantFromProperties
			// .getString("UPDATE_HISTORY_DETAIL");
			// update history table with
			// setPayPalTransactionStatus,setPaypalTransactionID
			/*
			 * AL_TRAN_HIST (TRAN_ID,CUST_EMAIL, CUST_NAME, CUST_PHONE
			 * , PAYPAL_TRAN_ID, MGI_REF_NUM, TRAN_DATE, TRAN_AMT, TRAN_FEE, TRAN_STATUS,PayPal_TRAN_STATUS
			 */

			String strQuery = "Update MGI_PAYPAL_TRAN_HIST set PayPal_TRAN_STATUS" +
					" = ? where PAYPAL_TRAN_ID = ? and  MGI_SESS_ID = ?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(strQuery);
			preparedStatement.setString(1, payPalTransactionStatus);
			preparedStatement.setString(2, paypalTransactionID);
			preparedStatement.setString(3, mgiTransactionSessionID);
			preparedStatement.executeUpdate();
			connection.close();
		LOGGER.debug("Exit updateHistoryDetail.");
	}
	public void updateHistoryDetailStatusReversedAndRejected(
			List<HistoryStatusReverseBean> historyStatusReverseBeanList,
			List<String> histroyStatusRejectedList)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter updateHistoryDetailStatusReversedAndRejected.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));
		Statement statement = connection.createStatement();
		for (HistoryStatusReverseBean historyStatusReverseBean : historyStatusReverseBeanList) {
			String quesrToUpdateReverse = constantFromProperties
					.getString("UPDATE_HISTORY_STAUS_REVERSED_PART1")
					.concat(historyStatusReverseBean.getMgiReferenceNumber())
					.concat(constantFromProperties
							.getString("UPDATE_HISTORY_STAUS_REVERSED_PART2"))
					.concat(historyStatusReverseBean
							.getMgiTransactionSessionID()).concat("'");

			statement.addBatch(quesrToUpdateReverse);
		}
		for (String mgiTransactionSessionID : histroyStatusRejectedList) {
			String queryToUpdateReject = constantFromProperties
					.getString("UPDATE_HISTORY_STAUS_REJECTED")
					.concat(mgiTransactionSessionID).concat("'");
			statement.addBatch(queryToUpdateReject);

		}
		statement.executeBatch();
		connection.close();

		LOGGER.debug("Exit updateHistoryDetailStatusReversedAndRejected.");
	}

}