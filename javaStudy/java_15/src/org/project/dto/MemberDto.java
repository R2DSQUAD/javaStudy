package org.project.dto;

import java.time.LocalDateTime;

import org.project.constraint.BasicTime;
import org.project.constraint.Role;
import org.project.entity.MemberEntity;

public class MemberDto extends BasicTime{
	private Long memberId;
	private String userEmail;	//회원가입 시 입력
	private String userPw;		//회원가입 시 입력
	private int age;			//회원가입 시 입력
	private String address;		//회원가입 시 입력
	private Role role;			//회원가입 시 입력
	
	//자동으로 설정
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	
	public MemberDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
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
	
	//form -> controller -> Service -> Dto -> Entity -> JPA Repository -> DB
	//memberEntity -> memberDto 회원 조회
	public static MemberDto toMemberDto(MemberEntity memberEntity) {
		
		MemberDto dto = new MemberDto();
		
		//반드시 회원 수정시 ID 필수 
		dto.setMemberId(memberEntity.getMemberId());
		dto.setUserEmail(memberEntity.getUserEmail());
		dto.setUserPw(memberEntity.getUserPw());
		dto.setAge(memberEntity.getAge());
		dto.setAddress(memberEntity.getAddress());
		dto.setRole(memberEntity.getRole());
		dto.setCreateTime(memberEntity.getCreateTime());
		dto.setUpdateTime(memberEntity.getUpdateTime());
		
		return dto;
	}
	
	
	
}
