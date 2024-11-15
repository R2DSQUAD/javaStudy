package org.java.service;

import java.util.List;

import org.java.dto.MemberDto;

public interface MemberService {
	//c
	int insert(MemberDto memberDto);
	//r
	List<MemberDto> members();
	//r
	MemberDto memberDetail(Long memberId);
	//u
	int update(MemberDto memberDto);
	//d
	int delete(Long memberId);
	
}
