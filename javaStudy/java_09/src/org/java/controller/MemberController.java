package org.java.controller;

import org.java.dao.MemberDao;

public class MemberController {
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
	}
}
