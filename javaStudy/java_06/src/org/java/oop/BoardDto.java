package org.java.oop;

import java.time.LocalDateTime;

public class BoardDto {
	private int boardId; // 보드 ID
	private String title; // 제목
	private String content; // 내용
	private String writer; // 작성자
	private String boardPw; // 글 비밀번호
	private int hit; // 조회수

	// 기본 시간 -> spring boot -> 자동으로 설정
	private LocalDateTime createTime; // 최초 작성 시간
	private LocalDateTime updateTime; // 업데이트 작성 시간

	// 생성자 AllArgsContstruct(모든 필드), NoArgsConstruct(기본)

	public BoardDto() {

	}

	public BoardDto(int boardId, String title, String content, String writer, String boardPw, int hit,
			LocalDateTime createTime, LocalDateTime updateTime) {
		super();
		this.boardId = boardId;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.boardPw = boardPw;
		this.hit = hit;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	// setter, getter
	public int getBoardId() {
		return boardId;
	}

	public void setBoardId(int boardId) {
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getBoardPw() {
		return boardPw;
	}

	public void setBoardPw(String boardPw) {
		this.boardPw = boardPw;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
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

	// toString()

	@Override
	public String toString() {
		return "BoardDto [boardId=" + boardId + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", boardPw=" + boardPw + ", hit=" + hit + ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}

}
