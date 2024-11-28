package org.java.project.service;

import java.util.List;

import org.java.project.dto.BoardDto;

public interface BoardService {
	int save(BoardDto boardDto);
	
	List<BoardDto> findAll();
	
	BoardDto findById(Long boardId);
	
	int updateSave(BoardDto boardDto);
	
	int deleteId(Long boardDto);
	
}
