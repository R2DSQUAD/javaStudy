package org.java.controller;

import java.sql.Connection;
import java.time.LocalDateTime;

import org.java.connect.DBConnect;
import org.java.dto.MemberDto;
import org.java.service.MemberService;

public class MemberController {
	public static void main(String[] args) {
		System.out.println("MemberController");
		
		Connection conn =DBConnect.getConnection();
	System.out.println(conn);
	
	MemberService service= null;
	
	service.insert(new MemberDto(1L, "m1@email.com","1111", LocalDateTime.now(), null)); 
	}
}
