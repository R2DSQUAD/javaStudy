package org.java.project.service;

import java.util.List;

import org.java.project.dto.MemberDto;

public interface MemberService {

	// 회원가입
	int save(MemberDto memberDto);

	// 회원조회(목록)
	List<MemberDto> findAll();

	// 회원조회(상세)
	MemberDto findById(Long memberId);

	// 회원수정
	int updateSave(MemberDto memberDto);

	// 회원삭제
	int deleteId(Long memberId);
	
	
}
