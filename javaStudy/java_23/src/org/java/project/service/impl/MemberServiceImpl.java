package org.java.project.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.java.project.dao.MemberDao;
import org.java.project.dto.MemberDto;
import org.java.project.entity.MemberEntity;
import org.java.project.service.MemberService;

// @Service
public class MemberServiceImpl implements MemberService{

	@Override
	public int save(MemberDto memberDto) {
		
		MemberDao dao= MemberDao.getInstance();
		
		// userEmail확인 -> 회원가입, 로그인
		MemberEntity memberEntity=
				dao.findByUserEmail(memberDto.getUserEmail());
		
		if(memberEntity!=null) throw new IllegalArgumentException("Fail!-> 중복 이메일 입니다!");
		// 회원가입 실행
		// Dto -> Entity		
		int rs=dao.save(MemberEntity.toInsertMemberEntity(memberDto));		
		if(rs!=1) 	 throw new IllegalArgumentException("Fail!-> 회원 가입 실패입니다!");		
		return rs;
	}

	@Override
	public List<MemberDto> findAll() {
		
		MemberDao dao= MemberDao.getInstance();
		
		List<MemberEntity> memberEntities= dao.findAll();
		
		if(memberEntities.isEmpty()) {
			 throw new NullPointerException("Fail!-> 조회할 데이터가 없습니다.!");
		}
		
		return  memberEntities.stream().map(MemberDto::toMemberDto).collect(Collectors.toList());
	}

	// 아이디 확인, 상세정보, 회원 유무, 회원수정 전, 회원삭제전
	@Override
	public MemberDto findById(Long memberId) {
		
		MemberDao dao= MemberDao.getInstance();
		
		  MemberEntity memberEntity= dao.findById(memberId);
		  
		  if(memberEntity==null) {
			  throw new IllegalArgumentException("Fail!-> 조회할 회원이 존재 하지않습니다!");
		  }		
		
		return MemberDto.toMemberDto(memberEntity);
	}

	@Override
	public int updateSave(MemberDto memberDto) {
		// 1. 회원 확인 -> member_id 검사
		MemberDao dao= MemberDao.getInstance();
		
		int rs=dao.updateSave(MemberEntity.toUpdateMemberEntity(memberDto));
				
		
		return rs;
	}

	@Override
	public int deleteId(Long memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
