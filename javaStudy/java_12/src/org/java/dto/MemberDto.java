package org.java.dto;

public class MemberDto {
	
	//Spring boot JPA에서 반드시 ID -> 객체형
	private Long id; //중복 불가, auto_increment
	private String email;
	private String pw;
	private String name;

	public MemberDto() {
	}

	public MemberDto(Long id, String email, String pw, String name) {
		super();
		this.id = id;
		this.email = email;
		this.pw = pw;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", email=" + email + ", pw=" + pw + ", name=" + name + "]";
	}

}
