package org.java.collection;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import org.project.constraint.Role;
import org.project.dto.MemberDto;

public class VextorEx3 {
	public static void main(String[] args) {
		System.out.println("Vector");
		
		//MemberDto -> while문 이용 -> exit 종료
		// "insert" -> MemberDto -> Vector -> List<MemberDto> 추가
		//	"exit" -> while문 종료, Scanner 이용 -> 3명 추가
		
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		List<MemberDto> members = new Vector<MemberDto>();
		while(!bool) {
			System.out.println("회원 서비스 시작 (exit 종료)");
			String q = sc.next();
			if(!q.equals("exit")) {
				while(true) {
					System.out.println("쿼리문 입력(insert) (exit 종료)");
					String query = sc.next();
					if(query.equals("insert")) {
						System.out.println("회원가입");
						System.out.print("id: ");
						Long id = sc.nextLong();
						System.out.print(" 이메일: ");
						String email = sc.next();
						System.out.print(" 비밀번호: ");
						String pw = sc.next();
						System.out.print(" 나이: ");
						int age = sc.nextInt();
						System.out.print(" 주소: ");
						String address = sc.next();
						members.add(new MemberDto(id, email, pw, age, address, Role.MEMBER, LocalDateTime.now(), null));
					}else if(query.equals("exit")) {
						bool = true;
						break;
					}else {
						System.out.println("쿼리문 입력 오류");
					}
				}
			}
		}
		for (MemberDto i : members) {
//			System.out.println(i+ " ");
			System.out.println("id: "+i.getMemberId()+ " , 이메일: "+i.getUserEmail()+ " , 비밀번호: "+i.getUserPw()+ " , 나이: "+i.getAge()+ " , 주소: "+i.getAddress()+ " , 권한: "+i.getRole()+ " , 가입시간: "+i.getCreateTime());
		}
		sc.close();
	}
}
