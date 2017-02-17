package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintTableSpirally {
	String driverName = "com.jnetdirect.jsql.JSQLDriver";
	String serverName = "127.0.0.1";
	String portNumber = "1433";
	String mydatabase = serverName + ":" + portNumber;
	String url = "jdbc:JSQLConnect://" + mydatabase;
	String username = "username";
	String password = "password";
	Connection connection;
	Statement stmt;

	public PrintTableSpirally() throws SQLException {
		connection = DriverManager.getConnection(url, username, password);
		// Create a scrollable result set
		stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
	}

	public void start() throws ClassNotFoundException, SQLException {

		Class.forName(driverName);
		// get row count
		int numberRow = getRowCount();

		// select whole table
		ResultSet resultSet = stmt.executeQuery("SELECT * FROM my_table");
		// get col count
		ResultSetMetaData rsmd = resultSet.getMetaData();
		int numberCol = rsmd.getColumnCount();

		int frontRow = 1;
		int backRow = numberRow;

		int frontCol = 1;
		int backCol = numberCol;

		// go to the first row
		resultSet.next();

		while (frontRow < backRow || frontCol < backCol) {

			for (int i = frontRow; i < backRow; i++) {
				resultSet.getString(frontCol);
				resultSet.next();
			}
			frontRow++;

			for (int i = frontCol; i < backCol; i++) {
				resultSet.getString(i);
			}

			frontCol++;

			if (frontRow < frontCol) {
				for (int i = backRow; i >= frontRow; i--) {
					resultSet.getString(backCol);
					resultSet.previous();
				}
				backRow--;
			}

			if (frontCol < backCol) {
				for (int i = backCol; i >= frontCol; i--) {
					resultSet.getString(i);
				}
				backCol--;
			}
		}

	}

	private int getRowCount() throws SQLException {
		// get row count
		ResultSet r = stmt.executeQuery("SELECT COUNT(*) AS rowcount FROM TableName");
		r.next();
		int numberRow = r.getInt("rowcount");
		r.close();
		return numberRow;
	}
}
