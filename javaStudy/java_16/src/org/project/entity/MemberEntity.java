package org.project.entity;

import java.time.LocalDateTime;

import org.project.constraint.Role;
import org.project.dto.MemberDto;

// @Entity -> DB 테이블과 같은 이름, 구조
public class MemberEntity {
	
	private Long memberId;				//auto increament
	private String userEmail;			//Unique -> 중복 불가
	private String userPw;				//암호화 -> Spring Security
	private int age;
	private String address;
	private Role role;					//필수 -> 권한 -> 기본 권한 부여
	
	//자동으로 설정
	private LocalDateTime createTime;	// ***
	private LocalDateTime updateTime;	// ***
	
	

	public MemberEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
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
		return "MemberEntity [memberId=" + memberId + ", userEmail=" + userEmail + ", userPw=" + userPw + ", age=" + age
				+ ", address=" + address + ", role=" + role + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}
	
	//회원가입시 Dto -> Entity
	public static MemberEntity toInsertMemberEntity(MemberDto memberDto) {
		MemberEntity memberEntity = new MemberEntity();
		
		memberEntity.setMemberId(memberDto.getMemberId());
		//회원 수정 시 받는 ID 필수
		
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserPw(memberDto.getUserPw());
		memberEntity.setAge(memberDto.getAge());
		memberEntity.setAddress(memberDto.getAddress());
		memberEntity.setRole(Role.MEMBER);
		memberEntity.setCreateTime(LocalDateTime.now());
		
		return memberEntity;
	}
	
	//회원가입시 Dto -> Entity
		public static MemberEntity toUpdateMemberEntity(MemberDto memberDto) {
			MemberEntity memberEntity = new MemberEntity();
			
			memberEntity.setMemberId(memberDto.getMemberId());
			//회원 수정 시 받는 ID 필수
			
			memberEntity.setUserEmail(memberDto.getUserEmail());
			memberEntity.setUserPw(memberDto.getUserPw());
			memberEntity.setAge(memberDto.getAge());
			memberEntity.setAddress(memberDto.getAddress());
			memberEntity.setRole(memberDto.getRole());
			memberEntity.setCreateTime(memberDto.getCreateTime());
			memberEntity.setUpdateTime(LocalDateTime.now());
			
			return memberEntity;
		}
}
