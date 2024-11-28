package org.project.dto;

import java.time.LocalDateTime;

import org.project.constraint.Role;

public class BoardDto {
	private Long boardId;			//PK
	private String title;		//UNIQUE
	private String content;			
	private int hit;				
	private String post;
	
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	public BoardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardDto(Long boardId, String title, String content, int hit, String post, LocalDateTime createTime,
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
		return "BoardDto [boardId=" + boardId + ", title=" + title + ", content=" + content + ", hit=" + hit + ", post="
				+ post + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	
	
	
	
}
