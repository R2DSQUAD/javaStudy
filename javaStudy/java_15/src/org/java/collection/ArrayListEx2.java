package org.java.collection;

import java.lang.reflect.Member;
import java.time.LocalDateTime;
import java.util.concurrent.Delayed;

import org.project.constraint.Role;
import org.project.dto.MemberDto;
import org.project.entity.MemberEntity;

public class ArrayListEx2 {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		// 회원가입

		// from -> DTO -> Entity -> JPA Repository <- JDBC -> DB
		// IOC (제어 반전)

		MemberEntity memberEntity = MemberEntity
				.toInsertMemberEntity(new MemberDto(1L, "m1@gmail.com", "111", 10, "서울시 노원구", Role.MEMBER, LocalDateTime.now(), null));

		
		System.out.println(memberEntity);
		// 회원가입 실행
		// JPA -> 회원등록
//		save(memberEntity);

		// 회원조회
		// userEmail -> Controller -> Service -> userEmail(isUserEmail) ->
		// findByUserEmail(userEmail) -> DB -> Entity -> DTO -> View
		// toMemberDto -> Entity -> Dto

//		MemberDto memberDto = MemberDto.toMemberDto(new MemberEntity(memberEntity.getMemberId(),
//				memberEntity.getUserEmail(), memberEntity.getUserPw(), memberEntity.getAge(), memberEntity.getAddress(),
//				memberEntity.getRole(), memberEntity.getCreateTime(), LocalDateTime.now()));
		
		MemberDto memberDto = MemberDto.toMemberDto(memberEntity);

//		System.out.println(memberDto);
		System.out.println(memberDto.getMemberId());	//id 체크 (회원 수정, 삭제, 상세 조회)
		System.out.println(memberDto.getUserEmail());
		System.out.println(memberDto.getUserPw());
		System.out.println(memberDto.getAge());
		System.out.println(memberDto.getAddress());
		System.out.println(memberDto.getRole());
		System.out.println(memberDto.getCreateTime());
		
		if(memberDto.getUpdateTime()!=null ) {
			System.out.println(memberDto.getUpdateTime());
		}
		
		System.out.println();
		
		System.out.println("===== 회원 수정 =====");
		
		memberDto.setAge(30);
		memberDto.setAddress("노원구 중계동");
		memberDto.setRole(Role.MANAGER);
		
		MemberEntity memberEntity2 = memberEntity.toUpdateMemberEntity(memberDto);
		
		System.out.println(memberEntity2.getMemberId());	//id 체크 (회원 수정, 삭제, 상세 조회)
		System.out.println(memberEntity2.getUserEmail());
		System.out.println(memberEntity2.getUserPw());
		System.out.println(memberEntity2.getAge());
		System.out.println(memberEntity2.getAddress());
		System.out.println(memberEntity2.getRole());
		System.out.println(memberEntity2.getCreateTime());
		if(memberEntity2.getUpdateTime()!=null ) {
			System.out.println(memberEntity2.getUpdateTime());
		}
	}
}
