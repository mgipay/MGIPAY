package com.ac;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.google.gson.Gson;

public class FeeLinkTable {
	
	public FeeLinkTable() {
		
	}

	public void insertFee(BigDecimal lowerLimit, BigDecimal upperLimit,
			BigDecimal feeCharge, String fundsType)
			throws ClassNotFoundException, SQLException {
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
	}

	public String selectFromFeelink() throws ClassNotFoundException,
			SQLException {

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@10.0.1.167:1521:devdb", "devdb",
				"devdbdevdb");
		String strQuery = "Select * from MGI_PAYPAL_FEE_DTL";

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

		return new Gson().toJson(feeLinkValues);
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		FeeLinkTable feeLinkTable = new FeeLinkTable();
		feeLinkTable.selectFromFeelink();
	}
}