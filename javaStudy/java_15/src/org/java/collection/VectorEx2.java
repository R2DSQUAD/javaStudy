package org.java.collection;

import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.project.constraint.Role;
import org.project.dto.MemberDto;

public class VectorEx2 {
	public static void main(String[] args) {
		System.out.println("Vector");
		
		List<MemberDto> members = new Vector<MemberDto>();
		members.add(new MemberDto(1L, "m1@email.com", "1111", 10, "서울시 노원구", Role.MANAGER, LocalDateTime.now(), null));
		members.add(new MemberDto(2L, "m2@email.com", "2222", 20, "서울시 강북구", Role.MEMBER, LocalDateTime.now(), null));
		members.add(new MemberDto(3L, "m3@email.com", "3333", 30, "서울시 강남구", Role.ADMIN, LocalDateTime.now(), null));
		members.add(new MemberDto(4L, "m4@email.com", "4444", 40, "서울시 서대문구", Role.ADMIN, LocalDateTime.now(), null));
		members.add(new MemberDto(5L, "m5@email.com", "5555", 50, "서울시 종로구", Role.MEMBER, LocalDateTime.now(), null));
		
		System.out.println(members.size());
		System.out.println(members.get(0));
		System.out.println(members.get(0).getUserEmail());
		System.out.println(members.get(0).getCreateTime());
		
		for (int i=0; i<members.size(); i++) {
//			System.out.println(members.get(i)+ " ");
			System.out.println("id: "+members.get(i).getMemberId()+ " , 이메일: "+members.get(i).getUserEmail()+ " , 비밀번호: "+members.get(i).getUserPw()+ " , 나이: "+members.get(i).getAge()+ " , 주소: "+members.get(i).getAddress()+ " , 권한: "+members.get(i).getRole()+ " , 가입시간: "+members.get(i).getCreateTime());
		}
		System.out.println();
		
		for (MemberDto i : members) {
//			System.out.println(i+ " ");
			System.out.println("id: "+i.getMemberId()+ " , 이메일: "+i.getUserEmail()+ " , 비밀번호: "+i.getUserPw()+ " , 나이: "+i.getAge()+ " , 주소: "+i.getAddress()+ " , 권한: "+i.getRole()+ " , 가입시간: "+i.getCreateTime());
		}
		System.out.println();
		
		Iterator<MemberDto> iterator = members.iterator();
		while(iterator.hasNext()) {
			MemberDto dto = iterator.next();
//			System.out.println(dto + " ");
			System.out.println("id: "+dto.getMemberId()+ " , 이메일: "+dto.getUserEmail()+ " , 비밀번호: "+dto.getUserPw()+ " , 나이: "+dto.getAge()+ " , 주소: "+dto.getAddress()+ " , 권한: "+dto.getRole()+ " , 가입시간: "+dto.getCreateTime());
		}
		
		System.out.println(members.get(1).getUserEmail());
		
		for(MemberDto i : members) {
			if(i.getUserEmail().equals("m2@email.com")) {
				System.out.println("id: "+i.getMemberId()+ " , 이메일: "+i.getUserEmail()+ " , 비밀번호: "+i.getUserPw()+ " , 나이: "+i.getAge()+ " , 주소: "+i.getAddress()+ " , 권한: "+i.getRole()+ " , 가입시간: "+i.getCreateTime());
			}
		}
	}
}
