package org.java.dao;

import java.sql.Connection;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;

public class MemberDao {
	private MemberDao() {
		System.out.println("싱글톤 -> MemberDao");
	}
	
	private static class SingleTon {
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}

	public int save(MemberDto memberDto) {
		//1. DB연동
		Connection conn=null;
		//2. SQL 작성
		String query="";
		//3. 쿼리 실행
		//4. 결과 return
		
		try {
			conn = DBConnect.getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn!=null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return 0;
	}
	
	
}
