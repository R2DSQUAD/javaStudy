package org.java.connect;

import java.sql.Connection;

public class DBConnect {
	public static Connection getConnection(){
		Connection conn = null;
		
		String driver = "oralcle.jdbc.driver.OracleDriver";
		
		//계정 아이디
		//계정 비밀번호
		//계정 Url
		
		try {
			Class.forName(driver);
			System.out.println("Driver OK");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver No");
			e.printStackTrace();
		}
		
		return conn;
	}
}
