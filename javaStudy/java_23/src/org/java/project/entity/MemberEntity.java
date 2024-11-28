package org.java.project.entity;

import java.time.LocalDateTime;

import org.java.project.constraint.Role;
import org.java.project.dto.MemberDto;

public class MemberEntity {

	private Long memberId;
	private String userEmail;
	private String userName;
	private int age;
	private Role role;

	private LocalDateTime createTime;
	private LocalDateTime updateTime;

	public MemberEntity() {
		// TODO Auto-generated constructor stub
	}

	public MemberEntity(Long memberId, String userEmail, String userName, int age, Role role, LocalDateTime createTime,
			LocalDateTime updateTime) {
		super();
		this.memberId = memberId;
		this.userEmail = userEmail;
		this.userName = userName;
		this.age = age;
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	/// Dto -> Entity 회원가입
	public static MemberEntity toInsertMemberEntity(MemberDto memberDto) {

		MemberEntity memberEntity = new MemberEntity();
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserName(memberDto.getUserName());
		memberEntity.setAge(memberDto.getAge());
		memberEntity.setRole(Role.MEMBER);
		memberEntity.setCreateTime(LocalDateTime.now());

		return memberEntity;
	}

	/// Dto -> Entity 회원수정
	public static MemberEntity toUpdateMemberEntity(MemberDto memberDto) {

		MemberEntity memberEntity = new MemberEntity();		
		// 필수 -> 회원 아이디
		memberEntity.setMemberId(memberDto.getMemberId());
		
		memberEntity.setUserEmail(memberDto.getUserEmail());
		memberEntity.setUserName(memberDto.getUserName());
		memberEntity.setAge(memberDto.getAge());
		memberEntity.setRole(memberDto.getRole());
		memberEntity.setCreateTime(memberDto.getCreateTime());
		// 회원수정 시간
		memberEntity.setUpdateTime(LocalDateTime.now());

		return memberEntity;
	}

	@Override
	public String toString() {
		return "MemberEntity [memberId=" + memberId + ", userEmail=" + userEmail + ", userName=" + userName + ", age="
				+ age + ", role=" + role + ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

}
