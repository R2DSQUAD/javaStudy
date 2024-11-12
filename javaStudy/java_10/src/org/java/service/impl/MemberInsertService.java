package org.java.service.impl;

import java.util.Scanner;

import org.java.constraint.Role;
import org.java.dao.MemberDao;
import org.java.dto.MemberDto;
import org.java.service.MemberService;

public class MemberInsertService implements MemberService {

	@Override
	public void excuteMemberService() {
		System.out.println("회원가입");
		MemberDao dao = MemberDao.getInstance();
		Scanner join = new Scanner(System.in);
		boolean bool = false;
		while (!bool) {
			System.out.println("회원가입 실행(exit -> 종료)");
			String q = join.next();
			if(!q.equals("exit")) {
				System.out.print("아이디: ");
				int memberId = join.nextInt();
				
				System.out.print("userEmail: ");
				String userEmail = join.next();
				
				System.out.print("userPw: ");
				String userPw = join.next();
				
				System.out.print("userName: ");
				String userName = join.next();
				
				System.out.print("addr: ");
				String userAddr = join.next();
				
				dao.insert(new MemberDto(memberId, userEmail, userPw, userName, userAddr, Role.MEMBER));
			}else {
				System.out.println("종료");
				bool = true;
			}
		}

	}
}
