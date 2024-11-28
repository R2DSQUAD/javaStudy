package org.java.project.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	public static Connection getConnection() {
		Connection conn = null;
		
//		oracle
		String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String usr = "system";
        String password = "1234";
		
//		mysql	
//		String driver="com.mysql.cj.jdbc.Driver";
//		String url="jdbc:mysql://localhost:3306/mysqltestdb";
//		String user="root";
//		String password="1234";

		try {
			Class.forName(driver);
			System.out.println("Driver Ok");
			
			conn=DriverManager.getConnection(url,usr, password);
			System.out.println("DB OK");
		}catch (ClassNotFoundException e) {
			System.out.println("Driver NO");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("DB NO");
			e.printStackTrace();
		}
		return conn;
	}
}
