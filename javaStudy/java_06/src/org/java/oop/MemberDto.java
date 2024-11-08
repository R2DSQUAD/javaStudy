package org.java.oop;

public class MemberDto {
	private int memberId;
	private String email;
	private String pw;
	private String nickName;
	private Role role;
	
	public MemberDto() {
	}
	
	public MemberDto(int memberId, String email, String pw, String nickName, Role role) {
		super();
		this.memberId= memberId;
		this.email = email;
		this.pw = pw;
		this.nickName = nickName;
		this.role = role;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", email=" + email + ", pw=" + pw + ", nickName=" + nickName
				+ ", role=" + role + "]";
	}

}
