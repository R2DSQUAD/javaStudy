package org.java.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import org.java.project.connect.DBConnect;
import org.java.project.entity.BoardEntity;

public class BoardDao {
	private BoardDao() {
		System.out.println("싱글톤");
	}

	private static class SingleTon {
		private static final BoardDao INSTANCE = new BoardDao();
	}

	public static BoardDao getInstance() {
		return SingleTon.INSTANCE;
	}

	public int save(BoardEntity boardEntity) {
		Connection conn = null;
		String query = null;
		PreparedStatement pstm = null;
		int rs = 0;

		try {
			conn = DBConnect.getConnection();
			query = "INSERT INTO BOARD_TB3(BOARD_ID, TITLE, CONTENT, MEMBER_ID, CREATETIME) VALUES (board_tb3_sequence.nextval, ?, ?, ?, ?)";
			pstm = conn.prepareStatement(query);

			pstm.setString(1, boardEntity.getTitle());
			pstm.setString(2, boardEntity.getContent());
			pstm.setInt(3, boardEntity.getMemberId().intValue());
			pstm.setTimestamp(4, Timestamp.valueOf(boardEntity.getCreateTime()));	
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
}
