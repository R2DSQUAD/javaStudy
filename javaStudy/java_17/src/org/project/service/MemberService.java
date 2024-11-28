package org.project.service;

import java.util.List;

import org.project.dto.MemberDto;

public interface MemberService {
	
	//회원가입
	int save(MemberDto membetDto);
	
	//회원조회
	List<MemberDto> findAll();
	
	//회원 상세 조회
	MemberDto findbyId(Long memberId);
	
	//회원 수정
	int updateSave(MemberDto memberDto);
	
	//회원 삭제
	MemberDto deleteId(Long memberId);

	
	
	
}
