package org.java.dao;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	//싱글톤
	private MemberDao() {
		System.out.println("MemberDao => 싱글톤");
	}
	
	private static class SingleTonClass {
		//초기화 -> 1 -> final
		private static final MemberDao INSTANCE = new MemberDao();
	}
	
	public static MemberDao getInstance() {
		return SingleTonClass.INSTANCE;
	}
	
	public int insert() {
		return 0;
	}

	public List<Object> select() {
		return new ArrayList<Object>();
	}
	
	public int update() {
		return 0;
	}
	
	public int delete() {
		return 0;
	}
}
