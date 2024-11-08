package org.java.dto;

import java.time.LocalDateTime;

import org.java.constrant.Role;

public class MemberDto {
	private int memberId;
	private String userEmail;
	private String userPw;
	private String userName;
	private String userAddr;
	private Role role;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int memberId, String userEmail, String userPw, String userName, String userAddr, Role role,
			LocalDateTime createTime, LocalDateTime updateTime) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
		this.userName = userName;
		this.userAddr = userAddr;
		this.role = role;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", userName="
				+ userName + ", userAddr=" + userAddr + ", role=" + role + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + "]";
	}	
}
