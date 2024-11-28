package org.java.collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.project.dto.BoardDto;

public class MapEx4 {
	public static void main(String[] args) {
		System.out.println("Map <K, V>");

		Map<String, List<BoardDto>> boardMap = new HashMap<String, List<BoardDto>>();

		List<BoardDto> board = new ArrayList<BoardDto>();
		board.add(new BoardDto(1L, "1제목1", "내용1", 0, "일반", LocalDateTime.now(), null));
		board.add(new BoardDto(2L, "1제목2", "내용2", 0, "일반", LocalDateTime.now(), null));
		board.add(new BoardDto(3L, "2제목3", "내용3", 0, "일반", LocalDateTime.now(), null));
		board.add(new BoardDto(4L, "2제목4", "내용4", 0, "일반", LocalDateTime.now(), null));
		board.add(new BoardDto(5L, "3제목5", "내용5", 0, "일반", LocalDateTime.now(), null));
		board.add(new BoardDto(6L, "3제목6", "내용6", 0, "비밀", LocalDateTime.now(), null));
		board.add(new BoardDto(7L, "4제목7", "내용7", 0, "비밀", LocalDateTime.now(), null));
		board.add(new BoardDto(8L, "4제목8", "내용8", 0, "비밀", LocalDateTime.now(), null));
		board.add(new BoardDto(9L, "5제목9", "내용9", 0, "비밀", LocalDateTime.now(), null));
		board.add(new BoardDto(10L, "5제목10", "내용10", 0, "비밀", LocalDateTime.now(), null));

		boardMap.put("board", board);

		System.out.println(boardMap);

		Set<String> set = boardMap.keySet();

		Iterator<String> iterator = set.iterator();

		System.out.println();

		while (iterator.hasNext()) {
			String keyStr = iterator.next();
			List<BoardDto> boardDtos = boardMap.get(keyStr);
			for (BoardDto boardDto : boardDtos) {
				if(boardDto.getTitle().contains("3")) {
					System.out.println(boardDto);
				}
//				if(boardDto.getPost().equals("일반")) {
//					System.out.println(boardDto);
//				}
			}
//				boardMap.get(keyStr).forEach(board2 -> System.out.println(board2));
		}
	}
}
