package org.project.service.Impl;

import java.util.List;

import org.project.dao.MemberDao;
import org.project.dto.MemberDto;
import org.project.service.MemberService;

public class MemberServiceImpl implements MemberService{

//	MemberDao dao = MemberDao.getInstance();
	
	@Override
	public int insert(MemberDto memberDto) {
		System.out.println("회원가입");
		//1. 이메일 확인
		String userEmail=memberDto.getUserEmail();
		
		
		int rs=0;
		MemberDao dao = MemberDao.getInstance();
		rs = dao.findByUserEmail(userEmail);
		//DAO
		
		if(rs==1) {
			throw new IllegalArgumentException("이미 등록된 이메일 입니다.");
		}
		
		//2. 회원 등록 -> 실행 (이메일이 없으면)
		System.out.println("회원가입 실행 -> ");
		//DAO
		
		int rs2 = dao.memberInsert(memberDto);
		if(rs2!=1) {
			System.out.println("실패");
		}
		System.out.println("성공");
		
		return rs2;
	}

	@Override
	public int update(MemberDto memberdto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String userEmail) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MemberDto> members() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDto member(String userEmail) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
