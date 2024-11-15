package org.java.controller;

import java.time.LocalDateTime;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;
import org.java.service.MemberService;
import org.java.service.impl.MemberServiceImpl;

public class MemberController {
	public static void main(String[] args) {
		System.out.println("Member Controller");
		
		DBConnect.getConnection();
		
		MemberService serv =null;
		serv = new MemberServiceImpl();
		serv.insert(new MemberDto(1L, "email", "1111", LocalDateTime.now(), null));
	}
}
