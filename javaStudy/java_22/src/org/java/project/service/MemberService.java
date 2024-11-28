package org.java.project.service;

import java.util.List;

import org.java.project.dto.MemberDto;

public interface MemberService {
	int save(MemberDto memberDto);
	
	List<MemberDto> findAll();
	
	MemberDto findById(Long memberId);
	
	int updateSave(MemberDto memberDto);
	
	int deleteId(Long memberId);
	
}
