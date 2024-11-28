
package org.java.project.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.java.project.dao.BoardDao;
import org.java.project.dao.MemberDao;
import org.java.project.dto.BoardDto;
import org.java.project.entity.BoardEntity;
import org.java.project.entity.MemberEntity;
import org.java.project.service.BoardService;

public class BoardServiceImpl implements BoardService{

	@Override
	public int save(BoardDto boardDto) {
		
		MemberDao dao= MemberDao.getInstance();
		MemberEntity memberEntity= dao.findById(boardDto.getMemberId());
		
		if(memberEntity==null) {
			throw new NullPointerException("Fail! -> 회원정보가 없습니다!");
		}
		
		 BoardDao bdao= BoardDao.getInstance();
		 
		int rs= bdao.save(BoardEntity.toInsertBoardEntity(boardDto));
		
		
		return rs;
	}

	@Override
	public List<BoardDto> findAll() {
		BoardDao dao = BoardDao.getInstance();
		List<BoardEntity> boardEntities = dao.findAll();
		
		if(boardEntities.isEmpty()) {
			throw new NullPointerException("Fail! -> 조회할 데이터가 없습니다.");
		}
		return boardEntities.stream().map(BoardDto::toBoardDto).collect(Collectors.toList());
	}

	@Override
	public BoardDto findById(Long boardId) {
		BoardDao dao= BoardDao.getInstance();
		
		  BoardEntity boardEntity= dao.findById(boardId);
		  
		  if(boardEntity==null) {
			  throw new IllegalArgumentException("Fail!-> 조회할 게시글이 존재 하지않습니다!");
		  }		
		
		return BoardDto.toBoardDto(boardEntity);
	}

	@Override
	public int updateSave(BoardDto boardDto) {
		BoardDao dao = BoardDao.getInstance();
		int rs = dao.updateSave(BoardEntity.toUpdateBoardEntity(boardDto));
		return rs;
	}

	@Override
	public int deleteId(Long boardId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
