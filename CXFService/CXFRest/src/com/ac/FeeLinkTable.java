package com.ac;

import java.io.*;
import java.math.BigDecimal;
import java.sql.*;

import com.google.gson.Gson;

public class FeeLinkTable {

	public void insertFeeForFiveHundred(BigDecimal feeAmount) {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("DBURL:"
					+ "jdbc:mysql://localhost:3306/LocalDB", "root", "root");

			String strQuery = "INSERT INTO FeeLookUpTable (CountryCode, LowRange, Upper"
					+ "Range, FundInFee, FundOutFee) VALUES (?,?,?,?,?,?);";
			PreparedStatement prest = con.prepareStatement(strQuery);
			BufferedReader bf = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter  CountryCode:");
			String CountryCode;
			CountryCode = bf.readLine();

			prest.setString(1, CountryCode);
			System.out.println("Enter LowRange :");
			BigDecimal LowRange = new BigDecimal(bf.readLine());
			prest.setBigDecimal(2, LowRange);
			int count = prest.executeUpdate();
			System.out.println(count + "row(s) affected");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String dbName = "LocalDB";
	}

	public String selectFromFeelink() throws ClassNotFoundException,
			SQLException {

		Connection con = null;

		Class.forName("oracle.jdbc.OracleDriver");
		 DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		con = DriverManager.getConnection(
				"jdbc:oracle:thin:@10.0.1.167:1521:devdb", "devdb",
				"devdbdevdb");
		String strQuery = "Select * from MGI_PAYPAL_FEE_DTL";

		PreparedStatement statement = con.prepareStatement(strQuery);
		ResultSet resultSet = statement.executeQuery();

		// UPPER_LIMIT FEE_CHARGES
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

		return new Gson().toJson(feeLinkValues);
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		FeeLinkTable feeLinkTable = new FeeLinkTable();
		feeLinkTable.selectFromFeelink();
	}

	public static void main1(String[] args) {
		System.out.println("Insert records example using prepared statement!");
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("DBURL:"
					+ "jdbc:mysql://localhost:3306/LocalDB", "root", "root");
			String dbName = "LocalDB";
			// try {
			// String updateString = "update " + dbName + ".COFFEES "
			// +"set SALES = ? where COF_NAME = ?";
			// String strQuery =
			// "INSERT INTO FeeLookUpTable (CountryCode, LowRange, UpperRange, FundInFee, FundOutFee) VALUES (?,?,?,?,?,?);";
			String strQuery = "Select * from MGI_PAYPAL_FEE_DTL";
			// String sql = "INSERT FeeLookUpTable VALUES(?,?,?,?,?)";
			PreparedStatement preparedStatement = con
					.prepareStatement(strQuery);
			BufferedReader bf = new BufferedReader(new InputStreamReader(
					System.in));
			System.out.println("Enter  CountryCode:");
			String CountryCode = bf.readLine();
			preparedStatement.setString(1, CountryCode);
			System.out.println("Enter LowRange :");
			BigDecimal LowRange = new BigDecimal(bf.readLine());
			preparedStatement.setBigDecimal(2, LowRange);
			int count = preparedStatement.executeUpdate();
			System.out.println(count + "row(s) affected");
			con.close();
		} catch (SQLException s) {
			System.out.println("SQL statement is not executed!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}