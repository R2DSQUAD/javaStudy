package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.project.connect.DBConnect;
import org.project.constraint.Role;
import org.project.dto.MemberDto;
import org.project.entity.MemberEntity;

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
		Connection conn= null;
		String query = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		
		int rs=0;
		
		try {
			conn=DBConnect.getConnection();
			
			query="SELECT COUNT(*) FROM MEMBER3 WHERE USEREMAIL=?";
			// query 실행
			pstm=conn.prepareStatement(query);
			pstm.setString(1, userEmail);
			//실행 insert, update, delete ->excuteUpdate()
			result = pstm.executeQuery();
			//실행 select -> excuteQuery()
			
			if(result != null) {
				while(result.next()) {
					rs=result.getInt(1);	//1이면 이메일 존재, 나머지 이메일은 회원가입
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (result != null)
					result.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return rs;
	}
	
	public int save(MemberEntity memberEntity) {
		Connection conn=null;
		String query = null;
		PreparedStatement pstm = null;
		int rs= 0;
		
		try {
			conn=DBConnect.getConnection();
			query="INSERT INTO MEMBER3(MEMBERID, USEREMAIL, USERPW, AGE, ADDRESS, ROLE, CREATETIME) VALUES(?, ?, ?, ?, ?, ?, ?)";
			pstm=conn.prepareStatement(query);
			
			pstm.setLong(1, memberEntity.getMemberId());
			pstm.setString(2,  memberEntity.getUserEmail());
			pstm.setString(3,  memberEntity.getUserPw());
			pstm.setInt(4,  memberEntity.getAge());
			pstm.setString(5,  memberEntity.getAddress());
			pstm.setString(6,  memberEntity.getRole().toString());
			pstm.setTimestamp(7, Timestamp.valueOf(memberEntity.getCreateTime()));
			
			//실행 insert, update, delete -> excuteUpdate()
			//성공 1, 실패 나머지
			rs = pstm.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			{
				try {
					if(conn != null)
						conn.close();
					if(pstm != null)
						pstm.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		return rs;
	}

	public List<MemberEntity> findAll() {
		
		//query 실행
		List<MemberEntity> memberEntities = new ArrayList<MemberEntity>();

		Connection conn= null;
		String query = "";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			query= "SELECT * FROM MEMBER3";
			pstm = conn.prepareStatement(query);
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while (rs.next()) {
					MemberEntity memberEntity = new MemberEntity(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), Role.valueOf(rs.getString(6)), rs.getTimestamp(7).toLocalDateTime(), null);
					memberEntities.add(memberEntity);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return memberEntities;
	}
	
	public MemberEntity findById (Long memberId) {
		MemberEntity memberEntity = null;

		Connection conn= null;
		String query = "";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			query= "SELECT * FROM MEMBER3 WHERE MEMBERID=? ";
			pstm = conn.prepareStatement(query);
			pstm.setLong(1, memberId.longValue());
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while (rs.next()) {
					memberEntity = new MemberEntity(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), Role.valueOf(rs.getString(6)), rs.getTimestamp(7).toLocalDateTime(), null);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return memberEntity;
		
	}

	public static MemberDto deleteById(Long memberId) {
		MemberEntity memberEntity = null;

		Connection conn= null;
		String query = "";
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			query = "DELETE FROM MEMBER3 WHERE MEMBERID=? ";
			pstm.setLong(1, memberId.longValue());
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while (rs.next()) {
					memberEntity = new MemberEntity(rs.getLong(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), Role.valueOf(rs.getString(6)), rs.getTimestamp(7).toLocalDateTime(), null);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return MemberDto.toMemberDto(memberEntity);
	}
}