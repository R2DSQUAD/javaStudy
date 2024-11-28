package org.java.project.service;

import java.util.List;

import org.java.project.dto.BoardDto;
import org.java.project.entity.BoardEntity;
import org.java.project.entity.MemberEntity;

public interface BoardService {

	// 게시글 작성
	int save(BoardDto boardDto);

	// 게시글조회(목록)
	List<BoardDto> findAll();

	// 게시글조회(상세)
	BoardDto findById(Long boardId);

	// 게시글수정
	int updateSave(BoardDto boardDto);

	// 게시글삭제
	int deleteId(Long boardId);
	
//	BoardEntity findByBoardId(Long boardId);
	
	// 게시글조회(목록)
}
