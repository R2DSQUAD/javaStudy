package org.java.service.Impl;

import org.java.dto.MemberDto;
import org.java.service.MemberService;

public class MemberServiceImpl implements MemberService{

	@Override
	public int insert(MemberDto memberDto) {
		System.out.println("회원가입");
		//1. 이메일 중복 여부
		String userEmail = memberDto.getUserEmail(); 
		System.out.println(userEmail);
		
		//SELECT * FROM TABLE WHERE userEmail=''		//null이 아니면 존재
		//SELECT COUNT(*) FROM TABLE WHERE userEmail=''		//레코드 개수 1이상 (존재) 0(X)
		
		
		int rs = 0;
		if(rs==1) {
			throw new IllegalArgumentException("이미 등록된 이메일 입니다");
		}
		//2. 있으면 Exception			
		
		//3. 없으면 -> 회원가입
		return 0;
	}
	
}
