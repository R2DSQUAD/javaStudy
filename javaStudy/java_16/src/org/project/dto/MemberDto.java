package org.project.dto;

import java.time.LocalDateTime;

import org.project.constraint.Role;
import org.project.entity.MemberEntity;

public class MemberDto {
	private Long memberId;
	private String userEmail;
	private String userPw;
	private int age;
	private String address;
	private Role role;
	
	//자동으로 설정
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	
	public MemberDto(Long memberId, String userEmail, String userPw, int age, String address, Role role,
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


	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
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


	@Override
	public String toString() {
		return "MemberDto [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", age=" + age
				+ ", address=" + address + ", role=" + role + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}
	
	public static MemberDto toMemeberDto (MemberEntity memberEntity) {
		MemberDto memberDto = new MemberDto();
		
		memberDto.setMemberId(memberEntity.getMemberId());
		//회원 수정 시 받는 ID 필수
		
		memberDto.setUserEmail(memberEntity.getUserEmail());
		memberDto.setUserPw(memberEntity.getUserPw());
		memberDto.setAge(memberEntity.getAge());
		memberDto.setAddress(memberEntity.getAddress());
		memberDto.setRole(memberEntity.getRole());
		memberDto.setCreateTime(memberEntity.getCreateTime());
		memberDto.setUpdateTime(memberEntity.getUpdateTime());
		
		return memberDto;
	}
	
	
}
