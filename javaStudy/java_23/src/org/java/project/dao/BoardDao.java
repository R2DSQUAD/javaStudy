package org.java.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.java.project.connect.DBConnect;
import org.java.project.constraint.Role;
import org.java.project.dto.BoardDto;
import org.java.project.entity.BoardEntity;
import org.java.project.entity.MemberEntity;

public class BoardDao {
//////////싱글톤 /////////////////
	private BoardDao() {
		System.out.println("싱글톤 ->  MemberDao");
	}

	private static class SingleTon {
		private static final BoardDao INSTANCE = new BoardDao();
	}

	public static BoardDao getInstance() {
		return SingleTon.INSTANCE;
	}
//////////싱글톤 /////////////////

	public int save(BoardEntity boardEntity) {

		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		int rs = 0;

		try {
			conn = DBConnect.getConnection();
			query = "insert into board_tb3( board_id,title,content,member_id, createTime )  "
					+ "  values(board_tb3_SEQUENCE.NEXTVAL,?,?,?,?)";
			// query실행
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

	public List<BoardEntity> findAll() {
		List<BoardEntity> boardEntities = new ArrayList<BoardEntity>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from BOARD_TB3 ";
			pstm = conn.prepareStatement(query);

			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					boardEntities.add(new BoardEntity(new Long(rs.getInt(1)), rs.getString(2), rs.getString(3),
							rs.getLong(4), rs.getTimestamp(5).toLocalDateTime(), rs.getTimestamp(6).toLocalDateTime()));
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

			return boardEntities;
		}
	}

	public BoardEntity findById(Long boardId) {
		BoardEntity boardEntity = null;

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String query = "";

		try {
			conn = DBConnect.getConnection();
			query = "select * from Board_TB3 where board_id=? ";
			pstm = conn.prepareStatement(query);
			pstm.setInt(1, boardId.intValue());
			rs = pstm.executeQuery();

			if (rs != null) {
				while (rs.next()) {
					boardEntity = new BoardEntity(new Long(rs.getInt(1)), rs.getString(2), rs.getString(3),
							rs.getLong(4), rs.getTimestamp(5).toLocalDateTime(), null);
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

		return boardEntity;
	}

	public int updateSave(BoardEntity boardEntity) {
		Connection conn = null;
		PreparedStatement pstm = null;
		String query = "";
		int rs = 0;
		try {
			conn = DBConnect.getConnection();
			query = " update  BOARD_TB3 " + " set TITLE=?,CONTENT =?, MEMBER_ID=?, createTime=?, updateTime=?"
					+ " where board_id=? ";
			pstm = conn.prepareStatement(query);
			pstm.setString(1, boardEntity.getTitle());
			pstm.setString(2, boardEntity.getContent());
			pstm.setLong(3, boardEntity.getMemberId());
			pstm.setTimestamp(4, Timestamp.valueOf(boardEntity.getCreateTime()));
			pstm.setTimestamp(5, Timestamp.valueOf(boardEntity.getUpdateTime()));
			pstm.setInt(6, boardEntity.getBoardId().intValue());

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
