package org.java.dao;

import java.util.List;

import org.java.dto.MemberDto;

public class MemberDao {
	private MemberDao() {
		
	}
	
	private static class SingleTonClass {
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	public static MemberDao getInstance() {
		return SingleTonClass.INSTANCE;
	}
	
	public int insert(MemberDto member) {
		System.out.println("회원가입 완료");
		String rs="" 
				+ "ID: "+member.getMemberId()
				+ ", EMAIL: "+member.getUserEmail()
				+ ", PW: "+member.getUserPw()
				+ ", NAME: "+member.getUserName()
				+ ", ADDR: "+member.getAddr()
				+ ", ROLE: "+member.getRole();
		System.out.println(rs);
		return 0;
	}
	
	public List<MemberDto> select() {
		return null;
	}

	public int update(MemberDto member) {
		return 0;
	}
	
	public int delete(MemberDto member) {
		return 0;
	}
}
