package org.java.collection;

import java.time.LocalDateTime;

//@Enmtity("board_tb")
public class BoardEntity {

//	CREATE TABLE BOARD_TB(
//			  BOARDID NUMBER NOT NULL 
//			,
//	TITLE VARCHAR2(100) NOT NULL 
//			,
//	CONTENT VARCHAR2(255) NOT NULL 
//			, HIT NUMBER NOT NULL 
//			,
//	POST VARCHAR2(20) NOT NULL 
//			, CREATETIME TIMESTAMP 
//			, UPDATETIME TIMESTAMP 
//	);
	
	private Long boardId;
	private String title;
	private String content;
	private int hit;
	private String post;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	
	public BoardEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BoardEntity(Long boardId, String title, String content, int hit, String post, LocalDateTime createTime,
			LocalDateTime updateTime) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.hit = hit;
		this.post = post;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}


	public Long getBoardId() {
		return boardId;
	}


	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public int getHit() {
		return hit;
	}


	public void setHit(int hit) {
		this.hit = hit;
	}


	public String getPost() {
		return post;
	}


	public void setPost(String post) {
		this.post = post;
	}


	public LocalDateTime getCreateTime() {
		return createTime;
	}


	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}


	public LocalDateTime getUpdateTime() {
		return updateTime;
	}


	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}


	@Override
	public String toString() {
		return "BoardEntity [boardId=" + boardId + ", title=" + title + ", content=" + content + ", hit=" + hit
				+ ", post=" + post + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	

}
