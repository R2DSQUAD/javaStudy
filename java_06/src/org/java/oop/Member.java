package org.java.oop;

public class Member {
	//모든 필드 private
	private int id;
	private String password;
	private String name;
	
	public Member(int id, String password, String name) {
		this.id=id;
		this.password=password;
		this.name=name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
}
