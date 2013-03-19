package com.ac;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

class HistoryTable {

	public String selectFromHistory(String emailId)
			throws ClassNotFoundException, SQLException {
		Connection con = null;

		Class.forName("com.mysql.jdbc.Driver");

		con = DriverManager.getConnection("DBURL:"
				+ "jdbc:mysql://localhost:3306/LocalDB", "root", "root");
		String strQuery = "SELECT top 10 * FROM MGI_PAYPAL_TR" +
				"AN_HIST WHERE CUST_EMAIL = ? and TRAN_DATE desc";

		PreparedStatement statement = con.prepareStatement(strQuery);
		ResultSet resultSet = statement.executeQuery();

		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();

		// UPPER_LIMIT FEE_CHARGES
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
		return new Gson().toJson(historyDetailsList);
	}

	public static void main(String[] args) {
		System.out.println("Select Records using PreparedStatement...");
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "LocalDB";
		String driverName = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "root";
		try {
			Class.forName(driverName);
			// Connecting to the database
			con = DriverManager.getConnection(url + dbName, userName, password);
			try { // Selecting records
				String sql = "SELECT top 10 * FROM HistoryTable WHERE CUST_EMAIL = ? and TRAN_DATE desc";
				// String strQuery =
				// "INSERT INTO HistoryTable (TRAN_ID,CUST_EMAIL, CUST_NAME, CUST_PHONE, PAYPAL_TRAN_ID, MGI_REF_NUM,TRAN_DATE,CREATION_DATE,LAST_UPDATE_DATE,TRAN_AMT,TRAN_FEE,TRAN_STATUS) VALUES (?,?,?,?,?,?,?,?,?,?,?);";
				statement = con.prepareStatement(sql);
				statement.setInt(1, 10);
				rs = statement.executeQuery();
				// System.out.println("Mail\phone\MGIReferenceNumber\transactionDate\withdrawamount\Fee\Sender-receiverName");
				System.out.println("---------------------------------");
				while (rs.next()) {
					String name = rs.getString("CUST_EMAIL");
					// int New=rs.FETCH_FORWARD;
					String Phone = rs.getString("CUST_PHONE");
					BigDecimal MGIReferenceNumber = rs
							.getBigDecimal("MGIReferenceNumber");
					BigDecimal transactionDate = rs
							.getBigDecimal("transactionDate");
					BigDecimal withdrawamount = rs
							.getBigDecimal("withdrawamount");
					BigDecimal Fee = rs.getBigDecimal("Fee");
					String receiverName = rs.getString("Sender-receiverName");

					System.out.println(name + "\t" + Phone + "\t"
							+ MGIReferenceNumber + "\t" + transactionDate
							+ "\t" + withdrawamount + "\t" + Fee + "\t"
							+ receiverName);

				}
			} catch (SQLException e) {
				System.out.println(e);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}