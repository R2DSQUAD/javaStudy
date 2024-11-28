package org.project.service.Impl;

import java.util.List;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;
import org.project.service.MemberService;

public class MemberServiceImpl implements MemberService {

	@Override
	public int save(MemberDto membetDto) {
		MemberDao dao = MemberDao.getInstance();
		return 0;
	}

	@Override
	public List<MemberDto> findAll() {
		MemberDao dao = MemberDao.getInstance();
		return null;
	}

	@Override
	public MemberDto findbyId(Long memberId) {
		MemberDao dao = MemberDao.getInstance();
		return null;
	}

	@Override
	public int updateSave(MemberDto memberDto) {
		MemberDao dao = MemberDao.getInstance();
		return 0;
	}

	@Override
	public int deleteId(Long memberId) {
		MemberDao dao = MemberDao.getInstance();
		return 0;
	}

}
