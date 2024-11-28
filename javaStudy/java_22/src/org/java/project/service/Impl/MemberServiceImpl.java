package org.java.project.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.java.project.dao.MemberDao;
import org.java.project.dto.MemberDto;
import org.java.project.entity.MemberEntity;
import org.java.project.service.MemberService;

public class MemberServiceImpl implements MemberService {

	@Override
	public int save(MemberDto memberDto) {
		// userEmail 확인
		// 회원가입 실행
		// Dto -> Entity
		System.out.println("회원가입");
		MemberDao memberDao = MemberDao.getInstance();
		
		int rs= memberDao.findByUserEmail(memberDto.getUserEmail());
		
		if(rs==1) {
			throw new IllegalArgumentException("중복 이메일 입력 실패");
		}
		
		int rs2= memberDao.save(MemberEntity.toMemberEntity(memberDto));
		if(rs2!=1) {
			throw new IllegalArgumentException("회원가입 실패");
		}
		return rs2;
	}

	@Override
	public List<MemberDto> findAll() {
		MemberDao memberDao = MemberDao.getInstance();
		List<MemberEntity> memberEntities = memberDao.findAll();
		
		if(!memberEntities.isEmpty()) {
			return memberEntities.stream().map(MemberDto::toMemberDto).collect(Collectors.toList());
		}
		throw new IllegalArgumentException("조회할 데이터가 없습니다");
	}

	@Override
	public MemberDto findById(Long memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateSave(MemberDto memberDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteId(Long memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
