package org.java.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.java.project.connect.DBConnect;
import org.java.project.constraint.Role;
import org.java.project.dto.MemberDto;
import org.java.project.entity.MemberEntity;

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
		Connection conn = null;
		String query = null;
		PreparedStatement pstm = null;
		ResultSet result = null;

		int rs = 0;

		try {
			conn = DBConnect.getConnection();
			query = "SELECT COUNT(*) FROM MEMBER_TB3 WHERE USEREMAIL=?";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userEmail);
			// insert, update, delete excuteUpdate();
			// select excuteQuery();
			result = pstm.executeQuery();

			if (result != null) {
				while (result.next()) {
					rs = result.getInt(1); // 1일 때 이메일 존재, 나머지는 회원가입

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
				if (result != null)
					result.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return rs;
	}

	public int save(MemberEntity memberEntity) {
		Connection conn = null;
		String query = null;
		PreparedStatement pstm = null;
		int rs = 0;

		try {
			conn = DBConnect.getConnection();
			query = "INSERT INTO MEMBER_TB3(MEMBER_ID, USEREMAIL, USERNAME, AGE, ROLE, CREATETIME) VALUES (member_tb3_sequence.nextval, ?, ?, ?, ?, ?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserName());
			pstm.setInt(3, memberEntity.getAge());
			pstm.setString(4, memberEntity.getRole().toString());
			pstm.setTimestamp(5, Timestamp.valueOf(memberEntity.getCreateTime()));	
			rs = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstm != null)
					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rs;
	}

	public List<MemberEntity> findAll() {
		List<MemberEntity> memberEntities = new ArrayList<MemberEntity>();
		
		Connection conn = null;
		String query = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			conn=DBConnect.getConnection();
			query="SELECT * FROM MEMBER_TB3";
			pstm=conn.prepareStatement(query);
			rs=pstm.executeQuery();
			
			if(rs != null) {
				while(rs.next()) {
					memberEntities.add(new MemberEntity(new Long(rs.getInt(1)), rs.getString(2),
							rs.getString(3),rs.getInt(4), Role.valueOf(rs.getString(5)), rs.getTimestamp(6).toLocalDateTime().now(), null));
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
	
	public int updateSace (MemberEntity memberEntity) {
		Connection conn = null;
		String query = null;
		PreparedStatement pstm = null;
		int rs = 0;
		
		try {
			conn = DBConnect.getConnection();
			query = "UPDATE MEMBER_TB3 SET USEREMAIL=?, USERNAME=?, AGE=?, ROLE=?, CREATETIME=?, UPDATETIME=? WHERE MEMBER_ID";
			
			pstm = conn.prepareStatement(query);
			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserName());
			pstm.setInt(3, memberEntity.getAge());
			pstm.setString(4, memberEntity.getRole().toString());
			pstm.setTimestamp(5, Timestamp.valueOf(memberEntity.getCreateTime()));
			pstm.setTimestamp(6, Timestamp.valueOf(LocalDateTime.now()));
			pstm.setInt(7, memberEntity.getMemberId().intValue());
			
			rs = pstm.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	public MemberEntity findbyId(Long memberId) {
		Connection conn = null;
		String query = null;
		PreparedStatement pstm = null;
		ResultSet result = null;
		
		try {
			conn=DBConnect.getConnection();
			query= "DELETE FROM MEMBER_TB3 WHERE MEMBER_ID";
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
}
