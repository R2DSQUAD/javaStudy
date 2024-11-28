package org.java.project.controller;

import java.util.Scanner;

import org.java.project.dto.BoardDto;
import org.java.project.service.BoardService;
import org.java.project.service.Impl.BoardServiceImpl;


public class BoardController {
	public static void main(String[] args) {
		System.out.println("BoardController");
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		BoardService service = new BoardServiceImpl();

		while (!bool) {
			System.out.println("프로그램 실행 (exit)");
			String q = sc.next();

			if (!q.equals("exit")) {
				System.out.println("쿼리문 입력 (exit)");
				String query = sc.next();
				if (query.equals("insert")) {
					System.out.println("게시물 작성");
					System.out.println("title : ");
					String title = sc.next();
					System.out.println("content : ");
					String content = sc.next();
					System.out.println("회원아이디 : ");
					Long memberId = sc.nextLong();

					int rs = service.save(new BoardDto(null, title, content, memberId, null, null));
					
					if (rs == 1) {
						System.out.println("게시글 작성");
					} else {
						System.out.println("게시글 작성 실패");
					}
				} else if (query.equals("select")) {
				} else if (query.equals("detail")) {
				} else if (query.equals("update")) {
				} else if (query.equals("exit")) {
					System.out.println("종료");
					bool = true;
				}

			} else {
				System.out.println("종료");
				bool = true;
			}
		}
	}
}
