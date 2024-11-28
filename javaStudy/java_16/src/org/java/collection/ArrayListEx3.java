package org.java.collection;

import java.time.LocalDateTime;

import org.project.constraint.Role;
import org.project.dto.MemberDto;
import org.project.entity.MemberEntity;

public class ArrayListEx3 {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		
		MemberDto dto = new MemberDto(1L, "m1@email.com", "1111", 11, 
				"서울시", Role.MEMBER, LocalDateTime.now(), null);
		
		MemberEntity entity = MemberEntity.toInsertMemberEntity(dto);
		
//		System.out.println(entity);
		
		//MemberEntity -> MemberDto
		
		MemberDto dto2 = MemberDto.toMemeberDto(entity);
		
		System.out.println(dto2);
	}
}
