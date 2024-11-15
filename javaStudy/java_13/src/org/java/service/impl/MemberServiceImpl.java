package org.java.service.impl;

import java.util.List;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;
import org.java.service.MemberService;

public class MemberServiceImpl implements MemberService{

	@Override
	public int insert(MemberDto memberDto) {
		System.out.println("회원가입");
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.save(memberDto);
		if(rs==1) {
			return 1;
		}
		return 0;
	}

	@Override
	public List<MemberDto> members() {
		System.out.println("회원조회(목록)");
		return null;
	}

	@Override
	public MemberDto memberDetail(Long memberId) {
		System.out.println("회원조회");
		return null;
	}

	@Override
	public int update(MemberDto memberDto) {
		System.out.println("회원수정");
		return 0;
	}

	@Override
	public int delete(Long memberId) {
		System.out.println("회원삭제");
		return 0;
	}
	
}
