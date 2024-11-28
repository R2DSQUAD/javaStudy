package org.java.collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.project.dto.BoardDto;

public class MapEx3 {
	public static void main(String[] args) {
		System.out.println("Map <K, V>");
		
		Map<String, List<BoardDto>> boardMap = new HashMap<String, List<BoardDto>>();

	
		// 일반 게시판 -> post: "일반"
		List<BoardDto> defaultBoard = new ArrayList<BoardDto>();
		defaultBoard.add(new BoardDto(1L, "D제목1", "내용1", 0, "일반", LocalDateTime.now(), null));
		defaultBoard.add(new BoardDto(2L, "D제목2", "내용2", 0, "일반", LocalDateTime.now(), null));
		defaultBoard.add(new BoardDto(3L, "D제목3", "내용3", 0, "일반", LocalDateTime.now(), null));
		defaultBoard.add(new BoardDto(4L, "D제목4", "내용4", 0, "일반", LocalDateTime.now(), null));
		defaultBoard.add(new BoardDto(5L, "D제목5", "내용5", 0, "일반", LocalDateTime.now(), null));
		
		defaultBoard.forEach(el -> System.out.println(el));
		
		System.out.println();
		
		// 비밀 게시판 -> post: "비밀"
		List<BoardDto> privateBoard = new ArrayList<BoardDto>();
		privateBoard.add(new BoardDto(1L, "P제목1", "내용1", 0, "일반", LocalDateTime.now(), null));
		privateBoard.add(new BoardDto(2L, "P제목2", "내용2", 0, "일반", LocalDateTime.now(), null));
		privateBoard.add(new BoardDto(3L, "P제목3", "내용3", 0, "일반", LocalDateTime.now(), null));
		privateBoard.add(new BoardDto(4L, "P제목4", "내용4", 0, "일반", LocalDateTime.now(), null));
		privateBoard.add(new BoardDto(5L, "P제목5", "내용5", 0, "일반", LocalDateTime.now(), null));
		
		privateBoard.forEach(el -> System.out.println(el));
		
		boardMap.put("일반게시판", defaultBoard);
		boardMap.put("비밀게시판", privateBoard);
		
		System.out.println(boardMap);
		
		Set<String> set =boardMap.keySet();
		
		Iterator<String> iterator = set.iterator();
		
		System.out.println();
		System.out.println("List");
		
		while(iterator.hasNext()) {
			String keyStr = iterator.next();
			
			if(keyStr.equals("일반게시판")) {
//				List<BoardDto> boardDtos = boardMap.get(keyStr);
//				for(BoardDto boardDto : boardDtos) {
//					System.out.println(boardDto);
//				}
				boardMap.get(keyStr).forEach(board->System.out.println(board));
			}
		}
	}
}
