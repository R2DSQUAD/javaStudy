package org.java.controller;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.java.oop.BoardDto;

public class BoardController {
	public static void main(String[] args) {
		BoardDto board = new BoardDto(0, "제목", "내용", "작성자", "1111", 1, LocalDateTime.now(), null);
		System.out.println("id : " + board.getBoardId());
		System.out.println("title : " + board.getTitle());
		System.out.println("content : " + board.getContent());
		System.out.println("write : " + board.getWriter());
		System.out.println("password : " + board.getBoardPw());
		System.out.println("hit : " + board.getHit());
		System.out.println("작성시간 : " + board.getCreateTime());

		BoardDto board1 = new BoardDto(1, "제목2", "내용2", "작성자2", "2222", 1, LocalDateTime.now(), null);
		System.out.println("id : " + board1.getBoardId());
		System.out.println("title : " + board1.getTitle());
		System.out.println("content : " + board1.getContent());
		System.out.println("write : " + board1.getWriter());
		System.out.println("password : " + board1.getBoardPw());
		System.out.println("hit : " + board1.getHit());
		System.out.println("작성시간 : " + board1.getCreateTime());

		BoardDto board2 = new BoardDto(2, "제목3", "내용3", "작성자3", "3333", 1, LocalDateTime.now(), null);
		System.out.println("id : " + board2.getBoardId());
		System.out.println("title : " + board2.getTitle());
		System.out.println("content : " + board2.getContent());
		System.out.println("write : " + board2.getWriter());
		System.out.println("password : " + board2.getBoardPw());
		System.out.println("hit : " + board2.getHit());
		System.out.println("작성시간 : " + board2.getCreateTime());

		BoardDto board3 = new BoardDto(3, "제목4", "내용4", "작성자4", "4444", 1, LocalDateTime.now(), null);
		System.out.println("id : " + board3.getBoardId());
		System.out.println("title : " + board3.getTitle());
		System.out.println("content : " + board3.getContent());
		System.out.println("write : " + board3.getWriter());
		System.out.println("password : " + board3.getBoardPw());
		System.out.println("hit : " + board3.getHit());
		System.out.println("작성시간 : " + board3.getCreateTime());

		BoardDto board4 = new BoardDto(4, "제목4", "내용4", "작성자4", "4444", 1, LocalDateTime.now(), null);
		System.out.println("id : " + board4.getBoardId());
		System.out.println("title : " + board4.getTitle());
		System.out.println("content : " + board4.getContent());
		System.out.println("write : " + board4.getWriter());
		System.out.println("password : " + board4.getBoardPw());
		System.out.println("hit : " + board4.getHit());
		System.out.println("작성시간 : " + board4.getCreateTime());

		boolean isTrue = true;
		Scanner sc = new Scanner(System.in);

		while (isTrue) {
			System.out.println("프로그램을 키시겠습니까?");
			String on = sc.next();
			if (!on.equals("exit")) {

				System.out.print("제목을 입력하세요: ");
				String title = sc.next();

				System.out.print("내용을 입력하세요: ");
				String content = sc.next();

				System.out.print("작성자를 입력하세요: ");
				String write = sc.next();

				System.out.print("비밀번호를 입력하세요: ");
				String password = sc.next();

				BoardDto bd = new BoardDto(1, title, content, write, password, 1, LocalDateTime.now(), null);

				System.out.println("id : " + bd.getBoardId());
				System.out.println("title : " + bd.getTitle());
				System.out.println("content : " + bd.getContent());
				System.out.println("write : " + bd.getWriter());
				System.out.println("password : " + bd.getBoardPw());
				System.out.println("hit : " + bd.getHit());
				System.out.println("작성시간 : " + bd.getCreateTime());

			} else {
				System.out.println("프로그램 종료");
				isTrue = false;
			}
		}
	}
}
