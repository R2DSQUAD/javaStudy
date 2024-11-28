package org.java.collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.project.constraint.Role;
import org.project.dto.MemberDto;
import org.project.entity.MemberEntity;

public class ArrayListEx4 {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		// 회원 5명 추가
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		memberDtos.add(new MemberDto(1L, "m1@email.com", "1111", 11, "서울시", Role.MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(2L, "m2@email.com", "2222", 22, "춘천시", Role.MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(3L, "m3@email.com", "3333", 33, "세종특별자치시", Role.MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(4L, "m4@email.com", "4444", 44, "제주시", Role.MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(5L, "m5@email.com", "5555", 55, "구리시", Role.MEMBER, LocalDateTime.now(), null));
		
		//forEach
		memberDtos.forEach(member-> System.out.println(member));
		
		for(MemberDto memberDto: memberDtos) {
			System.out.println(memberDto);
		}
		
		//List<MemberDto> -> List <memberEntity>
		System.out.println("List<MemberDto> -> List <memberEntity>");
		
		List<MemberEntity> memberEntities = new ArrayList<MemberEntity>();
		
		for(MemberDto memberDto: memberDtos) {
			MemberEntity memberEntity = MemberEntity.toInsertMemberEntity(memberDto);
			System.out.println(memberEntity);
		}
		
		memberEntities.forEach(memberEntity-> System.out.println(memberEntity));
		
		System.out.println("Stream ====");
		List<MemberDto> memberDtos2 = memberEntities.stream().map(MemberDto::toMemeberDto).collect(Collectors.toList());
	}
}
