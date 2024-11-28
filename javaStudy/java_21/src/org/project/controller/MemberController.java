package org.project.controller;

import org.project.connect.DBConnect;

public class MemberController {
	public static void main(String[] args) {
		System.out.println("MemberController");
		
		DBConnect.geConnection();
		
	}
}
