package org.project.service;

import java.util.List;

import org.project.dto.MemberDto;

public interface MemberService {
	int insertMember(MemberDto memberDto);		//DTO -> Entity
	List<MemberDto> members();					//Entity -> DTO
	MemberDto memberDetail(String userEmail);	//Entity -> DTO
	
}
