package com.ac;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

public class MoneyGramPayPalDAO {

	public MoneyGramPayPalDAO() {

	}

	private static Logger LOGGER = Logger.getLogger(MoneyGramPayPalDAO.class);

	public void insertFee(BigDecimal lowerLimit, BigDecimal upperLimit,
			BigDecimal feeCharge, String fundsType)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter insertFee.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@10.0.1.167:1521:devdb", "devdb",
				"devdbdevdb");
		String strQuery = "INSERT INTO MGI_PAYPAL_FEE_DTL (country_CODE, LOWER_LIMIT, UPPER_LIMIT"
				+ ", FEE_CHARGES, FUNDS_TYPE) VALUES (?,?,?,?,?,?);";
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, "usa");
		preparedStatement.setBigDecimal(2, lowerLimit);
		preparedStatement.setBigDecimal(3, upperLimit);
		preparedStatement.setBigDecimal(4, feeCharge);
		preparedStatement.setString(5, fundsType);
		preparedStatement.executeUpdate();
		connection.close();

		LOGGER.debug("Exit insertFee.");
	}

	public FeeLinkValues selectFromFeeDetailTable()
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter selectFromFeeDetailTable.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@10.0.1.167:1521:devdb", "devdb",
				"devdbdevdb");

		String strQuery = "Select * from MGI_PAYPAL_FEE_DTL";
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		ResultSet resultSet = preparedStatement.executeQuery();
		LOGGER.debug("result set came");
		BigDecimal feeForTwoHundred = null;
		BigDecimal feeForFiveHundred = null;
		while (resultSet.next()) {
			BigDecimal upperLimit = resultSet.getBigDecimal("UPPER_LIMIT");
			if (upperLimit.compareTo(new BigDecimal(200)) == 0) {
				feeForTwoHundred = resultSet.getBigDecimal("FEE_CHARGES");
				LOGGER.debug(feeForTwoHundred.toString());
			} else {
				feeForFiveHundred = resultSet.getBigDecimal("FEE_CHARGES");
				LOGGER.debug(feeForFiveHundred);
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

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@10.0.1.167:1521:devdb", "devdb",
				"devdbdevdb");
		String strQuery = "SELECT * FROM MGI_PAYPAL_TRAN_HIST WHERE CUST_EMAIL = ? order by"
				+ " TRAN_DATE desc";
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, emailId);
		ResultSet resultSet = preparedStatement.executeQuery();
		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		while (resultSet.next()) {
			HistoryDetails historyDetails = new HistoryDetails();
			historyDetails.setCustomerEmail(resultSet.getString("CUST_EMAIL"));
			historyDetails.setCustomerName(resultSet.getString("CUST_NAME"));
			historyDetails.setCustomerPhone(resultSet.getInt("CUST_PHONE"));
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
			historyDetailsList.add(historyDetails);

		}

		LOGGER.debug("Exit retrieveHistroyDetails.");

		return historyDetailsList;
	}

	public void insertHistoryDetails(
			CommitTransactionInputBean commitTransactionInputBean)
			throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		int tansactionId = 0;
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@10.0.1.167:1521:devdb", "devdb",
				"devdbdevdb");

		String strQuery = " (TRAN_ID, CUST_EMAIL, CUST_NAME, CUST_PHONE, PAYPAL_"
				+ "TRAN_ID, MGI_REF_NUM, TRAN_DATE, TRAN_AMT, TRAN_FEE, TRAN_STATUS,) "
				+ "ATUS) VALUES (?,?,?,?,?,?,?,?,?,?);";
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setInt(1, tansactionId);
		preparedStatement.setString(2,
				commitTransactionInputBean.getCustomerEmail());
		preparedStatement.setString(3,
				commitTransactionInputBean.getCustomerName());
		preparedStatement.setInt(4, Integer.parseInt(commitTransactionInputBean
				.getCustomerPhoneNumber()));
		preparedStatement.setString(5,
				commitTransactionInputBean.getPaypalTransactionID());
		preparedStatement.setString(6,
				commitTransactionInputBean.getMgiReferenceNumber());
		java.sql.Date transactionDate = (java.sql.Date) Calendar.getInstance()
				.getTime();
		preparedStatement.setDate(7, transactionDate);
		preparedStatement.setBigDecimal(8,
				commitTransactionInputBean.getTransactionAmount());
		preparedStatement.setBigDecimal(9,
				commitTransactionInputBean.getTransactionFee());
		preparedStatement.setString(10,
				commitTransactionInputBean.getTransactionStatus());

		preparedStatement.executeUpdate();
		connection.close();
	}
}