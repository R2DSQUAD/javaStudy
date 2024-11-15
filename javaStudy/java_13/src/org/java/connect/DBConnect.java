package org.java.connect;

import java.sql.Connection;

public class DBConnect {
	public static Connection getConnection(){
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);
			System.out.println("Oracle Driver OK");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Oracle Driver FAIL");
			e.printStackTrace();
		}
		return conn;
	}
}
