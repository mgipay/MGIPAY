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

import com.mgi.agentconnect.client.TransactionStatus;
import com.mgi.paypal.inputbean.SendValidationInputBean;
import com.mgi.paypal.util.FeeLinkValues;
import com.mgi.paypal.util.HistoryDetails;
import com.mgi.paypal.util.PropertyUtil;
import com.mgi.paypal.util.StatusToReverseBean;

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

	// TODO not used anywhere
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
		// TODO delete below line
		LOGGER.debug("emailId for retrive History  : " + emailId);

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));

		String strQuery = "SELECT * FROM (SELECT * FROM MGI_PAYPAL_TRAN_HIST "
				+ "WHERE CUST_EMAIL = ?  and TRAN_STATUS = ? "
				+ "order by TRAN_DATE desc) a where rownum < 11";
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, emailId);
		preparedStatement.setString(2, TransactionStatus.AVAILABLE.value());
		
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

		String strQuery = "SELECT * FROM (SELECT * FROM MGI_PAYPAL_TRAN_HIST "
				+ "WHERE TRAN_STATUS = ? and  order by TRAN_DATE desc) a where rownum < 1001";

		// constantFromProperties
		// .getString("RETRIEVE_HISTORY_DETAILS_FOR_BATCH_QUERY");
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
//		preparedStatement.setString(1, TransactionStatus.SEND_VALIDATION_FAILED.value());
		preparedStatement.setString(1, TransactionStatus.MGI_FAILED.value());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		while (resultSet.next()) {
			HistoryDetails historyDetails = new HistoryDetails();
			historyDetails.setMgiReferenceNumber(resultSet
					.getString("MGI_REF_NUM"));
			historyDetails.setTransactionAmount(resultSet
					.getBigDecimal("TRAN_AMT"));
			historyDetails.setTransactionFee(resultSet
					.getBigDecimal("TRAN_FEE"));
			historyDetails.setMgiTransactionSessionID(resultSet
					.getString("MGI_SESS_ID"));
			historyDetailsList.add(historyDetails);

		}

		LOGGER.debug("Exit retrieveHistroyDetails.");

		return historyDetailsList;
	}

	public void insertHistoryDetailsBeforeSendValidation(
			SendValidationInputBean sendValidationInputBean)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter insertHistoryDetails.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));
		String strQuery = null;


//		SQL> desc MGI_PAYPAL_TRAN_HIST
//		 Name                                      Null?    Type
//		 ----------------------------------------- -------- ----------------------------
//		 TRAN_ID                                   NOT NULL NUMBER(30)
//		 CUST_EMAIL                                NOT NULL VARCHAR2(200)
//		 CUST_NAME                                          VARCHAR2(200)
//		 CUST_PHONE                                         VARCHAR2(20)
//		 PAYPAL_TRAN_ID                            NOT NULL VARCHAR2(200)
//		 MGI_REF_NUM                               NOT NULL VARCHAR2(200)
//		 TRAN_DATE                                 NOT NULL DATE
//		 CREATION_DATE                                      TIMESTAMP(6)
//		 LAST_UPDATE_DATE                                   TIMESTAMP(6)
//		 TRAN_AMT                                  NOT NULL NUMBER(10,2)
//		 TRAN_FEE                                  NOT NULL NUMBER(10,2)
//		 TRAN_STATUS                               NOT NULL VARCHAR2(50)
//		 PAYPAL_TRAN_STATUS                        NOT NULL VARCHAR2(100)
//		 MGI_SESS_ID                                        VARCHAR2(200)
		
		strQuery = "INSERT INTO MGI_PAYPAL_TRAN_HIST (TRAN_ID, CUST_EMAIL, CUST_NAME, "
				+ "CUST_PHONE, PAYPAL_TRAN_ID, MGI_REF_NUM, TRAN_DATE, TRAN_AMT, TRAN_FEE, "
				+ "TRAN_STATUS, PayPal_TRAN_STATUS, MGI_SESS_ID) "
				+ "VALUES (mgi_paypal_tranid_seq.nextval,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, sendValidationInputBean.getSenderEmail()
				.toLowerCase());
		preparedStatement.setString(2,
				sendValidationInputBean.getSenderFirstName());
		preparedStatement.setString(3,
				sendValidationInputBean.getSenderHomePhone());
		preparedStatement.setString(4, "");// PAYPAL_TRAN_ID
		preparedStatement.setString(5, "");// MGI_REF_NUM
		java.util.Date sysDate = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(sysDate.getTime());
		preparedStatement.setDate(6, sqlDate);
		preparedStatement.setBigDecimal(7, sendValidationInputBean.getAmount());
		preparedStatement.setBigDecimal(8,
				sendValidationInputBean.getFeeAmount());
		preparedStatement.setString(9, TransactionStatus.IN_PROGRESS.value());
		preparedStatement.setString(10, "");// PayPal_TRAN_STATUS
		preparedStatement.setString(11,
				sendValidationInputBean.getMgiTransactionSessionID());

		preparedStatement.execute();
		connection.close();

		LOGGER.debug("Exit insertHistoryDetails.");

	}

	public void updateHistoryAfterCommitTransaction(String mgiTransactionSessionID,
			String mgiReferenceNumber) throws ClassNotFoundException,
			SQLException {

		LOGGER.debug("Enter updateHistoryAfterCommitTransaction.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));

		String strQuery = "update MGI_PAYPAL_TRAN_HIST set MGI_REF_NUM = ?" +
				" and TRAN_STATUS = ? where MGI_SESS_ID = ?";
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, mgiReferenceNumber);
		preparedStatement.setString(2, TransactionStatus.MGI_COMMITED.value());
		preparedStatement.setString(3, mgiTransactionSessionID);
		preparedStatement.executeUpdate();
		connection.close();

		LOGGER.debug("Exit updateHistoryAfterCommitTransaction.");
	}

	public void updateHistorySendValidationOrCommitTransactionFailed(String mgiTransactionSessionID
			)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter updateHistorySendValidationOrCommitTransactionFailed.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));

		String strQuery = "update MGI_PAYPAL_TRAN_HIST set " +
				" TRAN_STATUS = ? where MGI_SESS_ID = ?";
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, TransactionStatus.MGI_FAILED.value());
		preparedStatement.setString(2, mgiTransactionSessionID);
		preparedStatement.executeUpdate();
		connection.close();

		LOGGER.debug("Exit updateHistorySendValidationOrCommitTransactionFailed.");
	}

	public void updatePaypalFailed(String mgiTransactionSessionID)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter updateHistorySendValidationOrCommitTransactionFailed.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));

		String strQuery = "update MGI_PAYPAL_TRAN_HIST set " +
				" TRAN_STATUS = ? where MGI_SESS_ID = ?";
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, TransactionStatus.PAYPAL_FAILED.value());
		preparedStatement.setString(2, mgiTransactionSessionID);
		preparedStatement.executeUpdate();
		connection.close();

		LOGGER.debug("Exit updateHistorySendValidationOrCommitTransactionFailed.");
	}
	
	public void updateHistoryAfterPay(String mgiTransactionSessionID,
			String payPalTransactionID) throws ClassNotFoundException,
			SQLException {

		LOGGER.debug("Enter updateHistoryAfterPay.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));

		String strQuery = "update MGI_PAYPAL_TRAN_HIST set PAYPAL_TRAN_ID = ? "
				+ "and TRAN_STATUS = ? where MGI_SESS_ID = ?";
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, payPalTransactionID);
		preparedStatement.setString(2,
				TransactionStatus.PAYPAL_COMMITTED.value());
		preparedStatement.setString(3, mgiTransactionSessionID);
		
		preparedStatement.executeUpdate();
		connection.close();

		LOGGER.debug("Exit updateHistoryAfterPay.");
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

	public void updateHistoryDetailStatusReversedAndRejected(
			List<StatusToReverseBean> statusToReverseBeanList,
			List<String> stausToRejectBeanList)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter updateHistoryDetailStatusReversedAndRejected.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				constantFromProperties.getString("ORACLE_DB_URL"),
				constantFromProperties.getString("ORACLE_DB_LOGIN_ID"),
				constantFromProperties.getString("ORACLE_DB_PASSWORD"));
		Statement statement = connection.createStatement();
		for (StatusToReverseBean statusToReverseBean : statusToReverseBeanList) {
			
			String queryToUpdateReverse = " Update MGI_PAYPAL_TRAN_HIST set TRAN_STATUS = '"
					.concat(TransactionStatus.REVERSED.value())
					.concat("' and MGI_REF_NUM = '")
					.concat(statusToReverseBean.getMgiReferenceNumber())
					.concat("' where MGI_SESS_ID = '".concat(statusToReverseBean
							.getMgiTransactionSessionID())).concat("'");
			
			//TODO delete below line
			LOGGER.debug(queryToUpdateReverse);		
//					constantFromProperties
//					.getString("UPDATE_HISTORY_STAUS_REVERSED_PART1")
//					.concat(statusToReverseBean.getMgiReferenceNumber())
//					.concat(constantFromProperties
//							.getString("UPDATE_HISTORY_STAUS_REVERSED_PART2"))
//					.concat(statusToReverseBean
//							.getMgiTransactionSessionID()).concat("'");

			statement.addBatch(queryToUpdateReverse);
		}
		for (String mgiTransactionSessionID : stausToRejectBeanList) {
			String queryToUpdateReject = "Update MGI_PAYPAL_TRAN_HIST set TRAN_STATUS = '"
					.concat(TransactionStatus.REJECTED.value())
					.concat("' where MGI_SESS_ID = '")
					.concat(mgiTransactionSessionID).concat("'");
					
//					constantFromProperties
//					.getString("UPDATE_HISTORY_STAUS_REJECTED")
//					.concat(mgiTransactionSessionID).concat("'");
			statement.addBatch(queryToUpdateReject);

		}
		statement.executeBatch();
		connection.close();

		LOGGER.debug("Exit updateHistoryDetailStatusReversedAndRejected.");
	}

}