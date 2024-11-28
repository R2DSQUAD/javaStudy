package org.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.project.connect.DBConnect;
import org.project.constraint.Role;
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

//	public Optional<MemberEntity> findByUserEmail(String userEmail) {
//		Optional<MemberEntity> meOptional=null;
//		return meOptional;
//	}
	
	public int findByUserEmail(String userEmail) {
		Connection conn=null;
		String query = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		
		int rs= 0;
		
		try {
			conn=DBConnect.getConnection();
			
			query="SELECT COUNT(*) FROM MEMBER_TB2 WHERE USEREMAIL=?";
			pstm=conn.prepareStatement(query);
			pstm.setString(1, userEmail);
			
			result = pstm.executeQuery();
			
			if(result != null) {
				while(result.next()) {
					rs= result.getInt(1);
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null)
					conn.close();
				if(pstm != null)
					pstm.close();
				if (result != null)
					result.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		return rs;

	}
	//회원가입
	public int save(MemberEntity memberEntity) {
		Connection conn=null;
		String query = null;
		PreparedStatement pstm = null;
		int rs= 0;
		
		try {
			conn=DBConnect.getConnection();
			query="INSERT INTO MEMBER_TB2(MEMBERID, USEREMAIL, USERPW, AGE, ADDRESS, ROLE, CREATETIME, UPDATETIME) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
			pstm=conn.prepareStatement(query);
			
			pstm.setInt(1, memberEntity.getMemberId().intValue());
			pstm.setString(2, memberEntity.getUserEmail());
			pstm.setString(3, memberEntity.getUserPw());
			pstm.setInt(4, memberEntity.getAge());
			pstm.setString(5, memberEntity.getAddress());
			pstm.setString(6, Role.MEMBER.toString());
			pstm.setTimestamp(7,Timestamp.valueOf(LocalDateTime.now()));
			pstm.setTimestamp(8,null);
			
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

	public  List<MemberEntity> findAll() {
		
		List<MemberEntity> memberEntities = new ArrayList<MemberEntity>();
		
		Connection conn=null;
		String query = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			conn=DBConnect.getConnection();
			query="SELECT * FROM MEMBER_TB3";
			pstm=conn.prepareStatement(query);
			
			rs = pstm.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					memberEntities.add(new MemberEntity(new Long(rs.getInt(1)), rs.getString(2), 
							rs.getString(3), rs.getInt(4), rs.getString(5), Role.valueOf(rs.getString(6)), rs.getTimestamp(7).toLocalDateTime(), null));
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null)
					conn.close();
				if(pstm != null)
					pstm.close();
				if (rs != null)
					rs.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	
		return memberEntities;
	}

	//회원 수정 및 삭제
	public MemberEntity findById(Long memberId) {
		Connection conn=null;
		String query = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		
		try {
			conn=DBConnect.getConnection();
			
			query=" DELETE FROM MEMBER_TB2 WHERE MEMBERID=?";
			pstm=conn.prepareStatement(query);
			pstm.setInt(1, memberId.intValue());
			
			result = pstm.executeQuery();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn !=null)
					conn.close();
				if(pstm != null)
					pstm.close();
				if (result != null)
					result.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public void deleteById(Long memberId) {
		
		
	}

	public void saveUpdate(MemberEntity memberEntity) {
		Connection conn=null;
		String query = null;
		PreparedStatement pstm = null;
		int rs= 0;
		
		try {
			conn=DBConnect.getConnection();
			query="UPDATE MEMBER_TB2 USEREMAIL=?, USERPW=?, AGE=?, ADDRESS=?, ROLE=?, CREATETIME=?, UPDATETIME=? SET MEMBERID=?";
			pstm=conn.prepareStatement(query);
			
			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserPw());
			pstm.setInt(3, memberEntity.getAge());
			pstm.setString(4, memberEntity.getAddress());
			pstm.setString(5,memberEntity.getRole().toString());
			pstm.setTimestamp(6,Timestamp.valueOf(memberEntity.getCreateTime()));
			pstm.setTimestamp(7,Timestamp.valueOf(memberEntity.getUpdateTime()));
			pstm.setInt(8, memberEntity.getMemberId().intValue());
			
			//실행 insert, update, delete -> excuteUpdate()
			//성공 1, 실패 나머지
			pstm.executeUpdate();
			
			
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
	}


}
