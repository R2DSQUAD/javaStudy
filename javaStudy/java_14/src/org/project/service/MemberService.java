package org.project.service;

import java.util.List;

import org.project.dto.MemberDto;

public interface MemberService {
	
	// 1->OK, 1제외 -> Fail
	int insert(MemberDto memberdto);
	int update(MemberDto memberdto);
	int delete(String userEmail);
	
	//모든 리스트 get -> 회원 목록
	List<MemberDto> members();
	
	//이메일에 해당하는 회원 -> 회원 상세 조회
	MemberDto member(String userEmail);
	
	
}
