package org.java.dto;

import java.time.LocalDateTime;

public class MemberDto {
	
	private Long memberId;
	private String userEmail;
	private String userPw;
	
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	public MemberDto() {
		
	}

	public MemberDto(Long memberId, String userEmail, String userPw, LocalDateTime createTime,
			LocalDateTime updateTime) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
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
	
	
}
