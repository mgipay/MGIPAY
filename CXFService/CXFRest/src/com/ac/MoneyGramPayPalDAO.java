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
import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

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

	private static Logger LOGGER = Logger.getLogger(MoneyGramPayPalDAO.class);

	private static java.util.Hashtable dataSourceCache;

	public static boolean updateFeeFeeDetailTable(
			BigDecimal upperLimit, BigDecimal feeCharge, boolean fundsIn)
			throws SQLException, ClassNotFoundException {

		LOGGER.debug("Enter updateFeeFeeDetailTable.");

		Class.forName("oracle.jdbc.OracleDriver");
		Connection connection = DriverManager.getConnection(
				PropertyUtil.constantFromProperties.getString("ORACLE_DB_URL"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_LOGIN_ID"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_PASSWORD"));
		PreparedStatement preparedStatement = null;
		try {

			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

			String strQuery = PropertyUtil.constantFromProperties
					.getString("UPDATE_FEE_DETAIL_QUERY");
			preparedStatement = connection.prepareStatement(strQuery);

			preparedStatement.setBigDecimal(1, feeCharge);
			preparedStatement.setBigDecimal(2, upperLimit);
			if (fundsIn) {
				preparedStatement.setString(3, "Fund_In");
			} else {
				preparedStatement.setString(3, "Fund_Out");
			}
			preparedStatement.executeUpdate();

		} catch (Exception exception) {
			LOGGER.error("New Fee Not Updated Into Table 'MGI_PAYPAL_FEE_DTL'.");
			LOGGER.error(exception.getLocalizedMessage());
			return false;
		} finally {
			connection.close();
			preparedStatement.close();

		}

		LOGGER.debug("Exit updateFeeFeeDetailTable.");
		return true;
	}

	// TODO not used anywhere
	public FeeLinkValues selectFromFeeDetailTable()
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter selectFromFeeDetailTable.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		FeeLinkValues feeLinkValues = new FeeLinkValues();
		try {
			connection = DriverManager.getConnection(
					PropertyUtil.constantFromProperties
							.getString("ORACLE_DB_URL"),
					PropertyUtil.constantFromProperties
							.getString("ORACLE_DB_LOGIN_ID"),
					PropertyUtil.constantFromProperties
							.getString("ORACLE_DB_PASSWORD"));
			String strQuery = PropertyUtil.constantFromProperties
					.getString("SELECT_FEE_DETAIL_QUERY");
			preparedStatement = connection.prepareStatement(strQuery);
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

			feeLinkValues.setFeeForFiveHundred(feeForFiveHundred);
			feeLinkValues.setFeeForTwoHundred(feeForTwoHundred);
		} catch (Exception exception) {
			LOGGER.error("Retrieve from  Table 'MGI_PAYPAL_FEE_DTL' Failed.");
			LOGGER.error(exception.getLocalizedMessage());
			LOGGER.error(System.getProperty("line.separator"));
		} finally {
			connection.close();
		}
		LOGGER.debug("Exit selectFromFeeDetailTable.");

		return feeLinkValues;
	}

	public static List<HistoryDetails> retrieveHistroyDetails(
			String emailId) throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter retrieveHistroyDetails.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				PropertyUtil.constantFromProperties.getString("ORACLE_DB_URL"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_LOGIN_ID"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_PASSWORD"));
		List<HistoryDetails> historyDetailsList = new ArrayList<HistoryDetails>();
		String strQuery = "SELECT * FROM (SELECT * FROM MGI_PAYPAL_TRAN_HIST "
				+ "WHERE CUST_EMAIL = ?  and MGI_TRAN_STATUS  in (?,?,?,?) "
				+ "order by TRAN_DATE desc) a where rownum < 11";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {

			preparedStatement = connection.prepareStatement(strQuery);
			preparedStatement.setString(1, emailId);
			preparedStatement.setString(2, TransactionStatus.AVAIL.value());
			preparedStatement.setString(3, TransactionStatus.CANCL.value());
			preparedStatement.setString(4, TransactionStatus.RECVD.value());
			preparedStatement.setString(5, TransactionStatus.REFND.value());

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				HistoryDetails historyDetails = new HistoryDetails();
				historyDetails.setCustomerEmail(resultSet
						.getString("CUST_EMAIL"));
				historyDetails
						.setCustomerName(resultSet.getString("CUST_NAME"));
				historyDetails.setCustomerPhone(resultSet
						.getString("CUST_PHONE"));
				historyDetails.setMgiReferenceNumber(resultSet
						.getString("MGI_REF_NUM"));
				historyDetails.setPaypalTransactionID(resultSet
						.getString("PAYPAL_TRAN_ID"));
				historyDetails.setTransactionAmount(resultSet
						.getBigDecimal("TRAN_AMT"));
				historyDetails.setTransactionFee(resultSet
						.getBigDecimal("TRAN_FEE"));
				historyDetails.setTransactionID(resultSet
						.getBigDecimal("TRAN_ID"));
				historyDetails.setTransactionStatus(resultSet
						.getString("TRAN_STATUS"));
				Date transactionDate = resultSet.getDate(("TRAN_DATE"));
				DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
				historyDetails.setTransactionDate(df.format(transactionDate));
				historyDetails.setMgiTransactionStatus(resultSet
						.getString("MGI_TRAN_STATUS"));
				historyDetails.setMgiTransactionSessionID(resultSet
						.getString("MGI_SESS_ID"));
				historyDetailsList.add(historyDetails);

			}
		} catch (Exception exception) {
			LOGGER.error("Retrieve from  Table 'MGI_PAYPAL_TRAN_HIST' Failed.");
			LOGGER.error(exception.getLocalizedMessage());
		} finally {
			connection.close();
			preparedStatement.close();
			resultSet.close();
		}
		LOGGER.debug("Exit retrieveHistroyDetails.");

		return historyDetailsList;
	}

	public static List<String> retrieveHistroyDetailsForBatchProcess()
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter retrieveHistroyDetailsForBatchProcess.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				PropertyUtil.constantFromProperties.getString("ORACLE_DB_URL"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_LOGIN_ID"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_PASSWORD"));

		String strQuery = "SELECT * FROM (SELECT * FROM MGI_PAYPAL_TRAN_HIST "
				+ "WHERE TRAN_STATUS = 'MGI_FAILED' order by TRAN_DATE desc) a where rownum < 1001";
		List<String> mgiTransactionSessinIdList = new ArrayList<String>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			preparedStatement = connection.prepareStatement(strQuery);

			LOGGER.debug(strQuery);

			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				LOGGER.debug(resultSet.getString("MGI_SESS_ID"));
				mgiTransactionSessinIdList.add(resultSet
						.getString("MGI_SESS_ID"));

			}

			LOGGER.debug("Size : " + mgiTransactionSessinIdList.size());
		} catch (Exception exception) {

			exception.printStackTrace();
			LOGGER.error("retrieveHistroyDetailsForBatchProcess Failed.");
		} finally {

			connection.close();
			preparedStatement.close();
			resultSet.close();
		}

		LOGGER.debug("Exit retrieveHistroyDetailsForBatchProcess.");

		return mgiTransactionSessinIdList;
	}

	public void insertHistoryDetailsBeforeSendValidation(
			SendValidationInputBean sendValidationInputBean)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter insertHistoryDetailsBeforeSendValidation.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				PropertyUtil.constantFromProperties.getString("ORACLE_DB_URL"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_LOGIN_ID"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_PASSWORD"));
		String strQuery = null;
		strQuery = "INSERT INTO MGI_PAYPAL_TRAN_HIST (TRAN_ID, CUST_EMAIL, CUST_NAME, "
				+ "CUST_PHONE, PAYPAL_TRAN_ID, MGI_REF_NUM, TRAN_DATE, TRAN_AMT, TRAN_FEE, "
				+ "TRAN_STATUS, MGI_SESS_ID,MGI_TRAN_STATUS) "
				+ "VALUES (mgi_paypal_tranid_seq.nextval,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection

			.prepareStatement(strQuery);
			preparedStatement.setString(1, sendValidationInputBean
					.getSenderEmail().toLowerCase().trim());
			preparedStatement.setString(2, sendValidationInputBean
					.getSenderFirstName().concat(" ").concat(
							sendValidationInputBean.getSenderLastName()));
			preparedStatement.setString(3, sendValidationInputBean
					.getSenderHomePhone());
			preparedStatement.setString(4, "");// PAYPAL_TRAN_ID
			preparedStatement.setString(5, "");// MGI_REF_NUM
			java.util.Date sysDate = new java.util.Date();
			java.sql.Date sqlDate = new java.sql.Date(sysDate.getTime());
			preparedStatement.setDate(6, sqlDate);
			preparedStatement.setBigDecimal(7, sendValidationInputBean
					.getAmount());
			preparedStatement.setBigDecimal(8, sendValidationInputBean
					.getFeeAmount());
			preparedStatement.setString(9, TransactionStatus.IN_PROGRESS
					.value());// TRAN_STATUS
			preparedStatement.setString(10, sendValidationInputBean
					.getMgiTransactionSessionID());
			preparedStatement.setString(11, "");// MGI_TRAN_STATUS

			preparedStatement.execute();
		} catch (Exception exception) {

			exception.printStackTrace();
			LOGGER.error("insertHistoryDetailsBeforeSendValidation Failed.");
		} finally {
			connection.close();
			preparedStatement.close();
		}

		LOGGER.debug("Exit insertHistoryDetailsBeforeSendValidation.");

	}

	public boolean updateHistoryAfterCommitTransaction(
			String mgiTransactionSessionID, String mgiReferenceNumber)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter updateHistoryAfterCommitTransaction.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				PropertyUtil.constantFromProperties.getString("ORACLE_DB_URL"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_LOGIN_ID"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_PASSWORD"));
		PreparedStatement preparedStatement = null;
		String strQuery = "update MGI_PAYPAL_TRAN_HIST set MGI_REF_NUM = ?"
				+ " , TRAN_STATUS = ? where MGI_SESS_ID = ?";
		try {
			preparedStatement = connection.prepareStatement(strQuery);
			preparedStatement.setString(1, mgiReferenceNumber);
			preparedStatement.setString(2, TransactionStatus.MGI_COMMITED
					.value());
			preparedStatement.setString(3, mgiTransactionSessionID);
			preparedStatement.executeUpdate();
		} catch (Exception exception) {

			exception.printStackTrace();
			LOGGER.error("updateHistoryAfterCommitTransaction Failed");
			return false;
		} finally {
			connection.close();
			preparedStatement.close();
		}

		LOGGER.debug("Exit updateHistoryAfterCommitTransaction.");
		return true;
	}

	public void updateHistorySendValidationOrCommitTransactionFailed(
			String mgiTransactionSessionID) throws ClassNotFoundException,
			SQLException {

		LOGGER.debug("Enter updateHistorySendValidationOrCommitTransactionFailed.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				PropertyUtil.constantFromProperties.getString("ORACLE_DB_URL"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_LOGIN_ID"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_PASSWORD"));

		String strQuery = "update MGI_PAYPAL_TRAN_HIST set "
				+ " TRAN_STATUS = ? where MGI_SESS_ID = ?";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(strQuery);
			preparedStatement
					.setString(1, TransactionStatus.MGI_FAILED.value());
			preparedStatement.setString(2, mgiTransactionSessionID);
			preparedStatement.executeUpdate();
		} catch (Exception exception) {
			exception.printStackTrace();
			LOGGER.error("Updating history table as 'MGI_FAILED' failed for MgiTransactionSessionID : "
					+ mgiTransactionSessionID);
		} finally {
			connection.close();
			preparedStatement.close();
		}

		LOGGER.debug("Exit updateHistorySendValidationOrCommitTransactionFailed.");
	}

	public void updatePaypalFailed(
			String mgiTransactionSessionID) throws ClassNotFoundException,
			SQLException {

		LOGGER.debug("Enter updateHistorySendValidationOrCommitTransactionFailed.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				PropertyUtil.constantFromProperties.getString("ORACLE_DB_URL"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_LOGIN_ID"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_PASSWORD"));

		String strQuery = "update MGI_PAYPAL_TRAN_HIST set "
				+ " TRAN_STATUS = ? where MGI_SESS_ID = ?";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(strQuery);
			preparedStatement.setString(1, TransactionStatus.PAYPAL_FAILED
					.value());
			preparedStatement.setString(2, mgiTransactionSessionID);
			preparedStatement.executeUpdate();
		} catch (Exception exception) {
			exception.printStackTrace();
			LOGGER.error("Updating TRAN_STATUS = 'PAYPAL_FAILED' in history table fai"
					+ "led for mgiTransactionSessionID : "
					+ mgiTransactionSessionID);
		} finally {
			connection.close();
			preparedStatement.close();
		}

		LOGGER.debug("Exit updateHistorySendValidationOrCommitTransactionFailed.");
	}

	public boolean updateHistoryAfterPay(
			String mgiTransactionSessionID, String payPalTransactionID)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter updateHistoryAfterPay.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				PropertyUtil.constantFromProperties.getString("ORACLE_DB_URL"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_LOGIN_ID"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_PASSWORD"));

		String strQuery = "update MGI_PAYPAL_TRAN_HIST set PAYPAL_TRAN_ID = ? "
				+ ", TRAN_STATUS = ? , MGI_TRAN_STATUS = ? where MGI_SESS_ID = ?";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(strQuery);
			preparedStatement.setString(1, payPalTransactionID);
			preparedStatement.setString(2, TransactionStatus.PAYPAL_COMMITTED
					.value());
			preparedStatement.setString(3, TransactionStatus.AVAIL.value());
			preparedStatement.setString(4, mgiTransactionSessionID);
			preparedStatement.executeUpdate();
		} catch (Exception exception) {
			LOGGER.error("Updating PAYPAL_TRAN_ID =  "
					+ payPalTransactionID
					+ ", TRAN_STATUS = PAYPAL_COMMITTED , MGI_TRAN_STATUS = AVAIL  where MGI_SESS_ID = "
					+ mgiTransactionSessionID + "Failed");
			LOGGER.error(exception.getLocalizedMessage());
			exception.printStackTrace();
			return false;
		} finally {
			connection.close();
			preparedStatement.close();
		}

		LOGGER.debug("Exit updateHistoryAfterPay.");
		return true;
	}

	public void updateHistoryDetail(
			String detailLookUpStatus, String mgiTransactionSessionID)
			throws ClassNotFoundException, SQLException {

		LOGGER.debug("Enter updateHistoryDetail.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				PropertyUtil.constantFromProperties.getString("ORACLE_DB_URL"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_LOGIN_ID"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_PASSWORD"));

		String strQuery = "update MGI_PAYPAL_TRAN_HIST set "
				+ "MGI_TRAN_STATUS = ? where MGI_SESS_ID = ?";
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(strQuery);
			preparedStatement.setString(1, detailLookUpStatus);

			preparedStatement.setString(2, mgiTransactionSessionID);
			preparedStatement.executeUpdate();
		} catch (Exception exception) {
			LOGGER.error("Updating History failed for MGI_TRAN_STATUS : "
					+ detailLookUpStatus + " and MGI_SESS_ID : "
					+ mgiTransactionSessionID);
		} finally {
			connection.close();
			preparedStatement.close();
		}
		LOGGER.debug("Exit updateHistoryDetail.");
	}

	public static void updateHistoryDetailStatusReversedAndRejected(
			List<StatusToReverseBean> statusToReverseBeanList,
			List<String> stausToRejectBeanList) throws ClassNotFoundException,
			SQLException {

		LOGGER.debug("Enter updateHistoryDetailStatusReversedAndRejected.");

		Class.forName("oracle.jdbc.OracleDriver");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection connection = DriverManager.getConnection(
				PropertyUtil.constantFromProperties.getString("ORACLE_DB_URL"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_LOGIN_ID"),
				PropertyUtil.constantFromProperties
						.getString("ORACLE_DB_PASSWORD"));

		Statement statement = null;
		try {
			statement = connection.createStatement();

			for (StatusToReverseBean statusToReverseBean : statusToReverseBeanList) {

				String queryToUpdateReverse = " Update MGI_PAYPAL_TRAN_HIST set TRAN_STATUS = '"
						+ TransactionStatus.REVERSED.value()
						+ "' , MGI_REF_NUM = '"
						+ statusToReverseBean.getMgiReferenceNumber()
						+ "' where MGI_SESS_ID = '"
						+ statusToReverseBean.getMgiTransactionSessionID()
						+ "'";
				// TODO
				LOGGER.debug(queryToUpdateReverse);

				statement.addBatch(queryToUpdateReverse);
			}
			for (String mgiTransactionSessionID : stausToRejectBeanList) {
				String queryToUpdateReject = "Update MGI_PAYPAL_TRAN_HIST set TRAN_STATUS = '"
						+ TransactionStatus.REJECTED.value()
						+ "' where MGI_SESS_ID = '"
						+ mgiTransactionSessionID
						+ "'";

				LOGGER.debug(queryToUpdateReject);

				statement.addBatch(queryToUpdateReject);

			}
			statement.executeBatch();
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			connection.close();
			statement.close();
		}

		LOGGER.debug("Exit updateHistoryDetailStatusReversedAndRejected.");
	}
	/**
	 * 
	 * @return Connection
	 */
	public static Connection getConnection() {
		Connection con = null;
		String jndi = PropertyUtil.constantFromProperties
				.getString("ORACLE_DB_JNDI_NAME");

		try {

			if (getDataSourceCache().containsKey(jndi)) {
				DataSource ds = (DataSource) getDataSourceCache().get(jndi);
				return ds.getConnection();
			}

			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");

			DataSource ds = (DataSource) envContext.lookup(jndi);

			getDataSourceCache().put(jndi, ds);
			con = ds.getConnection();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}

	/**
	 * 
	 * @return dataSourceCache
	 */
	private static java.util.Hashtable getDataSourceCache() {
		if (dataSourceCache == null) {
			dataSourceCache = new Hashtable();
		}
		return dataSourceCache;
	}

}