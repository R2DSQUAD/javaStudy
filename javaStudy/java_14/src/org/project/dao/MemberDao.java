package org.project.dao;

import java.sql.Timestamp;

import org.project.connect.DBConnect;
import org.project.dto.MemberDto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao {
	private MemberDao() {
		System.out.println("싱글톤");
	}
	
	private static class SingleTon {
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
	
	public int findByUserEmail(String userEmail) {
		Connection conn= null;			// DB연동
		String query = null;			// SQL 쿼리문
		PreparedStatement pstm = null;	// SQL 실행
		ResultSet result=null;			// 결과 반환 select
		
		int rs=0;
		
		try {
			conn=DBConnect.getConnection();
			
			query="select count(*) from member where userEmail=?";
			pstm=conn.prepareStatement(query);
			//insert, update, delete
			pstm.setString(1, userEmail);
			//select
			result = pstm.executeQuery();
			
			if(result != null) {
				while(result.next()){
					rs=result.getInt(1);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (result != null)
					result.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return 0;
	}
	
	public int memberInsert (MemberDto memberDto) {
		Connection conn = null;
		String query = null;
		PreparedStatement pstm = null;	// SQL 실행
		
		int rs =0;// 결과 반환 select
		
		try {
			conn=DBConnect.getConnection();
			query="INSERT INTO MEMBER (MEMBERID,USEREMAIL, USERPW ,CREATETIME VALUES(?,?,?,?)";
			pstm=conn.prepareStatement(query);
			pstm.setLong(1, memberDto.getMemberId());
			pstm.setString(2, memberDto.getUserEmail());
			pstm.setString(3, memberDto.getUserPw());
			pstm.setTimestamp(4, Timestamp.valueOf(memberDto.getCreateTime()));
			//insert, update, delete
			rs = pstm.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return rs;
	}
}
