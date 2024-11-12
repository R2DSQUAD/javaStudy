package org.java.dto;

import org.java.constraint.Role;

public class MemberDto {
	private int memberId;
	private String userEmail;
	private String userPw;
	private String userName;
	private String addr;
	private Role role;
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemberDto(int memberId, String userEmail, String userPw, String userName, String addr, Role role) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
		this.userName = userName;
		this.addr = addr;
		this.role = role;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", userName="
				+ userName + ", addr=" + addr + ", role=" + role + "]";
	}
	
	
	
	
}
