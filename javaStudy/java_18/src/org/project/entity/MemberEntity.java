package org.project.entity;

import java.time.LocalDateTime;

import org.project.constraint.Role;

public class MemberEntity {
	private Long memberId;
	private String userEmail;
	private String userPw;
	private int age;
	private String address;
	private Role role;
	
	//시간 -> 필수 -> 스프링에서 자동으로 설정
	//생성시에 한번만 실행 제약조건, 수정X
	private LocalDateTime createTime;
	// 수정시마다 실행 제약조건, 생성 X
	private LocalDateTime updateTime;
	
	//Builder 타입
	//@NoArgsConstruct -> lombok
	public MemberEntity() {
		
	}
	
	//@NoArgsConstruct -> lombok
	public MemberEntity(Long memberId, String userEmail, String userPw, int age, String address, Role role,
			LocalDateTime createTime, LocalDateTime updateTime) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userPw = userPw;
		this.age = age;
		this.address = address;
		this.role = role;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	
	//@Getter, @Setter, @Data -> lombok

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
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
	
	
	//@ToString
	@Override
	public String toString() {
		return "MemberEntity [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", age=" + age
				+ ", address=" + address + ", role=" + role + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}
	
	
	
	
	
}