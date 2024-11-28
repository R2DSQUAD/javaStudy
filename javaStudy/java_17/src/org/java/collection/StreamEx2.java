package org.java.collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.project.constraint.Role;
import org.project.dto.MemberDto;

public class StreamEx2 {
	public static void main(String[] args) {
		
		System.out.println("Stream");
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		//회원 3 ->
		memberDtos.add(new MemberDto(1L, "m1@m", "1111", 15, "노원구", Role.MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(2L, "m2@m", "2222", 16, "노원구", Role.MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(3L, "m3@m", "3333", 53, "노원구", Role.MEMBER, LocalDateTime.now(), null));
		
		for(MemberDto memberDto: memberDtos) {
			System.out.println(memberDto);
		}
		
		System.out.println();
		memberDtos.forEach(el-> System.out.println(el));
		System.out.println();
		memberDtos.forEach(el->{
			System.out.println(el);
		});
		System.out.println();
		
		List<MemberDto> memberDtos2 = memberDtos.stream().collect(Collectors.toList());
	}
}
