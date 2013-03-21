package com.ac;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class HistoryTable {
	
	public HistoryTable() {
		
	}

	public List<HistoryDetails> retrieveHistroyDetails(String emailId)
			throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@10.0.1.167:1521:devdb", "devdb",
				"devdbdevdb");
		String strQuery = "SELECT top 10 * FROM MGI_PAYPAL_TRAN_HIST WHERE CUST_EMAIL = ? an"
				+ "d TRAN_DATE desc";

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
			historyDetailsList.add(historyDetails);
		}
		return historyDetailsList;
	}

	public void insertHistoryDetails(String customerEmail, String customerName,
			Integer customerPhoneNumber, String mgiReferenceNumber,
			String paypalTransactionID, BigDecimal transactionAmount,
			BigDecimal transactionFee, String transactionStatus)
			throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@10.0.1.167:1521:devdb", "devdb",
				"devdbdevdb");

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
		preparedStatement.executeUpdate();
		connection.close();
	}

}