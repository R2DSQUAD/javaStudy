package org.java.service;

import java.util.List;

import org.java.dto.MemberDto;

public interface MemberService {
	
	//회원가입
	int insert(MemberDto memberDto);
	
	//회원조회(목록)
	List<MemberDto> members();
	
	//회원탈퇴
	int delete(Long id);
	
	//회원수정
	int update(MemberDto memberDto);
}
