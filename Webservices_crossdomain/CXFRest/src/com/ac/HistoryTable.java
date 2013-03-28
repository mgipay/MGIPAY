package com.ac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

class HistoryTable {

	public HistoryTable() {

	}

	private static Logger LOGGER = Logger.getLogger(HistoryTable.class);

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
<<<<<<< HEAD:Webservices_crossdomain/CXFRest/src/com/ac/HistoryTable.java
=======
			Date transactionDate = resultSet.getDate(("TRAN_DATE"));
			DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			historyDetails.setTransactionDate(df.format(transactionDate));
>>>>>>> MOdified for History Details:CXFService/CXFRest/src/com/ac/HistoryTable.java
			historyDetailsList.add(historyDetails);

		}
<<<<<<< HEAD:Webservices_crossdomain/CXFRest/src/com/ac/HistoryTable.java
=======

		LOGGER.debug("Exit retrieveHistroyDetails.");

>>>>>>> MOdified for History Details:CXFService/CXFRest/src/com/ac/HistoryTable.java
		return historyDetailsList;
	}

	public void insertHistoryDetails(
			CommitTransactionInputBean commitTransactionInputBean)
			throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@10.0.1.167:1521:devdb", "devdb",
				"devdbdevdb");

<<<<<<< HEAD:Webservices_crossdomain/CXFRest/src/com/ac/HistoryTable.java
		String strQuery = "INSERT INTO MGI_PAYPAL_TRAN_HIST (CUST_EMAIL, CUST_NAME, CUST_PHONE"
				+ ", MGI_REF_NUM, PAYPAL_TRAN_ID,TRAN_AMT,TRAN_FEE,TRAN_STATUS) VALUES (?,?,?,?,?,?,?,?);";
		PreparedStatement preparedStatement = connection
				.prepareStatement(strQuery);
		preparedStatement.setString(1, customerEmail);
		preparedStatement.setString(2, customerName);
		preparedStatement.setInt(3, customerPhoneNumber);
		preparedStatement.setString(4, mgiReferenceNumber);
		preparedStatement.setString(5, paypalTransactionID);
		preparedStatement.setBigDecimal(6, transactionAmount);
		preparedStatement.setBigDecimal(7, transactionFee);
		preparedStatement.setString(8, transactionStatus);
=======
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
		preparedStatement.setInt(4,Integer.parseInt(
				commitTransactionInputBean.getCustomerPhoneNumber()));
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

>>>>>>> MOdified for History Details:CXFService/CXFRest/src/com/ac/HistoryTable.java
		preparedStatement.executeUpdate();
		connection.close();
	}

}