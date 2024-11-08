package org.java.controller;

import java.util.Scanner;

import org.java.service.impl.item.ItemDeleteImpl;
import org.java.service.impl.item.ItemInsertImpl;
import org.java.service.impl.item.ItemSelectImpl;
import org.java.service.impl.item.ItemUpdateImpl;

public class ItemController {
	public static void main(String[] args) {
		System.out.println("상품 Controller");
		
		boolean bool = false;
		Scanner sc = new Scanner(System.in);
		
		while(!bool) {
			System.out.println("상품 입고를 시스템을 키시겠습니까? (Y/N)");
			String start = sc.next();
			ItemService serv = null;
			if(start.equals("y") || start.equals("Y")) {
				while(true) {
					System.out.println("쿼리문을 입력해주세요.");
					System.out.println("예시) insert, select, update, delete");
					System.out.print("입력: ");
					String query = sc.next();
					
					if(query.equals("insert")) {			//POST			등록, 추가, 가입 ...
						serv = new ItemInsertImpl();
						serv.excuteQueryService();
					} else if(query.equals("update")) {		//PUT, PATCH	데이터 수정	(/id 조회 필요)
						serv = new ItemUpdateImpl();
						serv.excuteQueryService();
					} else if(query.equals("delete")) {		//DELETE		삭제 (/id 조회 필요)
						serv = new ItemDeleteImpl();
						serv.excuteQueryService();
					} else if(query.equals("select")) {		//GET			조회, 상세조회 (id)
						serv = new ItemSelectImpl();
						serv.excuteQueryService();
					} else if(query.equals("exit")) {
						System.out.println("프로그램을 종료합니다.");
						bool = true;
						break;
					} else {
						System.out.println("쿼리문을 잘못 입력하셨습니다. 다시 작성해주세요.");
					}
					
				}
			}else {
				System.out.println("프로그램을 종료합니다.");
				bool= true;
			}
			sc.close();
		}
	}
}
