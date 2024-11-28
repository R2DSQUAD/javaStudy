package org.java.project.controller;

import java.util.List;
import java.util.Scanner;

import org.java.project.dto.BoardDto;
import org.java.project.service.BoardService;
import org.java.project.service.impl.BoardServiceImpl;

public class BoardController {

	public static void RequestMapping() {

		System.out.println("BoardController");

		Scanner input = new Scanner(System.in);

		boolean bool = false;

		BoardService service = new BoardServiceImpl();

		while (!bool) {
			System.out.println("프로그램 시작?(exit)");
			String q = input.next();

			if (!q.equals("exit")) {

				while (!bool) {
					System.out.println("쿼리문 입력?(exit)");

					String query = input.next();
					
					if (query.equals("insert")) {
						
						// 게시글 작성
						// title
						System.out.println("title: ");
						String title = input.next();
						// content
						System.out.println("content: ");
						String content = input.next();
					
						System.out.println("유저 아이디: ");
						Long memberId = input.nextLong();
						
						int rs = service.save(new BoardDto(null, title, content, memberId,null,null));

						if (rs == 1) {
							System.out.println("게시글작성 성공! 목록페이지로 이동!");
						} else {
							System.out.println("실패!!");
						}

					} else if (query.equals("delete")) {

					} else if (query.equals("detail")) {
						System.err.println("게시물 아이디: ");
						 Long boardId = input.nextLong();
						 
						 BoardDto boardDto = service.findById(boardId);
						 System.out.println(boardDto);

					} else if (query.equals("select")) {
						List<BoardDto> mList = service.findAll();
						mList.forEach(board -> System.out.println(board));

					} else if(query.equals("update")) {
						System.err.println("게시물 아이디: ");
						Long boardId = input.nextLong();
						
						BoardDto boardDto = service.findById(boardId);
						
						System.out.println("게시물 정보: "+boardDto);
						
						System.out.println("제목: ");
						String title = input.next();
						
						System.out.println("내용: ");
						String content = input.next();
						
						int rs = service.updateSave(new BoardDto(boardId, title, content, boardDto.getMemberId(), boardDto.getCreateTime(), null));
						
						if (rs == 1) {
							System.out.println("게시물 수정 성공!!");
						}
					}
					else if (query.equals("exit")) {
						System.out.println("종료!!");
						return;
					}
				}

			} else {
				System.out.println("보드 종료");
				return;
			}
		}
	}
}
