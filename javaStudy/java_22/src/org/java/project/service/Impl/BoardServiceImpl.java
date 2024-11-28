package org.java.project.service.Impl;

import java.util.List;

import org.java.project.dao.BoardDao;
import org.java.project.dao.MemberDao;
import org.java.project.dto.BoardDto;
import org.java.project.entity.BoardEntity;
import org.java.project.entity.MemberEntity;
import org.java.project.service.BoardService;

public class BoardServiceImpl implements BoardService {

	@Override
	public int save(BoardDto boardDto) {
		MemberDao dao = MemberDao.getInstance();
		MemberEntity memberEntity = dao.findbyId(boardDto.getMemberId());
		if(memberEntity==null)
		{
			throw new NullPointerException("회원 정보가 없습니다");
		}
		
		BoardDao bDao = BoardDao.getInstance();
		
		int rs = bDao.save(BoardEntity.toBoardEntity(boardDto));
		return rs;
	}

	@Override
	public List<BoardDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDto findById(Long boardId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateSave(BoardDto boardDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteId(Long boardDto) {
		// TODO Auto-generated method stub
		return 0;
	}


}
