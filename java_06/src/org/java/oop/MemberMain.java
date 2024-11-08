package org.java.oop;

public class MemberMain {
	public static void main(String[] args) {
		
		Member member1 = new Member(1, "1111","m1");
		System.out.print("id: "+member1.getId());
		System.out.print(", password: "+member1.getPassword());
		System.out.println(", name: "+member1.getName());
		
		Member member2 = new Member(2, "2222","m2");
		System.out.print("id: "+member2.getId());
		System.out.print(", password: "+member2.getPassword());
		System.out.println(", name: "+member2.getName());
	}
}
