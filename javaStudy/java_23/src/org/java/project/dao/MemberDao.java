package org.java.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.java.project.connect.DBConnect;
import org.java.project.constraint.Role;
import org.java.project.entity.MemberEntity;

public class MemberDao {
//////////싱글톤 /////////////////
	private MemberDao() {
		System.out.println("싱글톤 ->  MemberDao");
	}

	private static class SingleTon {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}
//////////싱글톤 /////////////////

	public MemberEntity findByUserEmail(String userEmail) {

		MemberEntity memberEntity = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from MEMBER_TB3 where userEmail=? ";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, userEmail);
			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					memberEntity = new MemberEntity(new Long(rs.getInt(1)), rs.getString(2), rs.getString(3),
							rs.getInt(4), Role.valueOf(rs.getString(6)), rs.getTimestamp(7).toLocalDateTime(), null);
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
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return memberEntity;
	}

	public int save(MemberEntity memberEntity) {

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		int rs = 0;

		try {
			conn = DBConnect.getConnection();

			query = "insert into MEMBER_TB3( member_id,userEmail,userName,AGE, ROLE, CREATETIME )  "
					+ "  values(member_tb3_SEQUENCE.NEXTVAL,?,?,?,?,?)";
			// query실행
			pstm = conn.prepareStatement(query);
			// ?, String userEmail
			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserName());
			pstm.setInt(3, memberEntity.getAge());
			pstm.setString(4, Role.MEMBER.toString());
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
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from MEMBER_TB3 ";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					memberEntities.add(new MemberEntity(new Long(rs.getInt(1)), rs.getString(2), rs.getString(3),
							rs.getInt(4), Role.valueOf(rs.getString(5)), rs.getTimestamp(6).toLocalDateTime(), rs.getTimestamp(7).toLocalDateTime()));
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
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return memberEntities;
	}

	public MemberEntity findById(Long memberId) {
		MemberEntity memberEntity = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from MEMBER_TB3 where member_id=? ";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, memberId.intValue());
			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					memberEntity = new MemberEntity(
							new Long(rs.getInt(1)), 
							rs.getString(2), 
							rs.getString(3),
							rs.getInt(4), Role.valueOf(rs.getString(5)), 
							rs.getTimestamp(6).toLocalDateTime(), null);
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
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return memberEntity;
	}

	public int updateSave(MemberEntity memberEntity) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		int rs = 0;
		try {
			conn = DBConnect.getConnection();
			query = " update  MEMBER_TB3 " + " set userEmail=?,userName =?, age=?, role=?, createTime=?, updateTime=?"
					+ " where member_id=? ";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, memberEntity.getUserEmail());
			pstm.setString(2, memberEntity.getUserName());
			pstm.setInt(3, memberEntity.getAge());
			pstm.setString(4, Role.MEMBER.toString());
			pstm.setTimestamp(5, Timestamp.valueOf(memberEntity.getCreateTime()));
			pstm.setTimestamp(6, Timestamp.valueOf(memberEntity.getUpdateTime()));
			pstm.setInt(7, memberEntity.getMemberId().intValue());

			rs = pstm.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)					conn.close();
				if (pstm != null)					pstm.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return rs;

	}

}
