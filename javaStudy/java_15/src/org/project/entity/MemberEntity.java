package org.project.entity;

import java.time.LocalDateTime;

import org.project.constraint.Role;
import org.project.dto.MemberDto;

public class MemberEntity {
	private Long memberId;
	private String userEmail;
	private String userPw;
	private int age;
	private String address;
	private Role role;
	
	//자동으로 설정
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
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
	
	//form -> controller -> Service -> Dto -> Entity -> JPA Repository -> DB ->Entity -> Dto -> Service ->
	//memberDto -> memberEntity 회원 가입
	public static MemberEntity toInsertMemberEntity(MemberDto memberDto) {
		MemberEntity en = new MemberEntity();
		
		en.setMemberId(memberDto.getMemberId()); // auto_increment -> 회원가입 시에 자동
		// 이메일 -> 중복 불가 -> constraint -> Spring Security ID
		en.setUserEmail(memberDto.getUserEmail());
		// Spring > 반드시, 비밀번호 암호화 진행 -> Spring Security
		en.setUserPw(memberDto.getUserPw());
		en.setAge(memberDto.getAge());
		en.setAddress(memberDto.getAddress());
		en.setRole(Role.MEMBER);
		en.setCreateTime(LocalDateTime.now());
		
		return en;
	}
	
	public static MemberEntity toUpdateMemberEntity(MemberDto memberDto) {
		MemberEntity en = new MemberEntity();
		
		en.setMemberId(memberDto.getMemberId()); // auto_increment -> 회원가입 시에 자동
		// 이메일 -> 중복 불가 -> constraint -> Spring Security ID
		en.setUserEmail(memberDto.getUserEmail());
		// Spring > 반드시, 비밀번호 암호화 진행 -> Spring Security
		en.setUserPw(memberDto.getUserPw());
		en.setAge(memberDto.getAge());
		en.setAddress(memberDto.getAddress());
		en.setRole(Role.MEMBER);
		en.setCreateTime(memberDto.getCreateTime());
		en.setUpdateTime(LocalDateTime.now());
		
		return en;
	}
	
}
