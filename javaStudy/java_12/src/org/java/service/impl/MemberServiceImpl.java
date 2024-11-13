package org.java.service.impl;

import java.util.List;

import org.java.dao.MemberDao;
import org.java.dto.MemberDto;
import org.java.service.MemberService;

public class MemberServiceImpl implements MemberService{

	@Override
	public int insert(MemberDto memberDto) {
		MemberDao dao = MemberDao.getInstance();
		int rs = dao.memberInsert(memberDto);
		
		if(rs == 1) {
			System.out.println("회원가입 성공");
			return 1;
		}else {
			System.out.println("회원가입 실패");
			return 0;
		}		
	}

	@Override
	public List<MemberDto> members() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
