package org.project.connect;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnect {
	public static Connection geConnection() {
		Connection conn = null;
		
//		oracle
//		String driver="oracel.jdbc.driver.OracleDriver";
//		String url="jdbc:oracle:thin:@localhosy:1521/xe";
//		String user="system";
//		String password="1234";
		
//		mysql	
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/mysqltestdb";
		String user="root";
		String password="1234";

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 NO");
			e.printStackTrace();
//		}catch(SQLException e) {
//			System.out.println("DB연동 NO");
//			e.printStackTrace();
		}
		
		return conn;
	}
}
