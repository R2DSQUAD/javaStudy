package org.java.dao;

import org.java.dto.MemberDto;

public class MemberDao {
	private MemberDao() {
		System.out.println("싱글톤");
	}

	private static class SingleTon {
		private static final MemberDao INSTANCE = new MemberDao();
	}

	public static MemberDao getInstance() {
		return SingleTon.INSTANCE;
	}

	public int memberInsert(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
