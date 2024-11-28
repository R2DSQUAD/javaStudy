package org.java.collection;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import org.project.constraint.Role;
import org.project.dto.MemberDto;
import org.project.entity.MemberEntity;

public class CollectionEx {
	public static void main(String[] args) {
		System.out.println("Collection");
		
		System.out.println("List");
		
		List<MemberDto> memberDtos = new ArrayList<MemberDto>();
		memberDtos.add(new MemberDto(1L, "m1@m", "11", 14, "서울", Role.MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(2L, "m2@m", "12", 14, "서울", Role.MEMBER, LocalDateTime.now(), null));
		memberDtos.add(new MemberDto(3L, "m3@m", "13", 14, "서울", Role.MEMBER, LocalDateTime.now(), null));
		
		memberDtos.forEach(member -> System.out.println(member.getMemberId()+" "+member.getUserEmail()+" "+member.getUserPw()+" "+member.getAge()+" "+member.getAddress()+" "+member.getRole()+" "+member.getCreateTime()+" "+member.getUpdateTime()));
		
		System.out.println("Set");
		Set<String> set = new HashSet<String>();
		set.add("JAVA");
		set.add("SPRING");
		set.add("REACT");
		set.add("RDBMS");
		set.add("WAS");
		set.add("AWS");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.print(str+ " ");
		}
		
		System.out.println("Queue");
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		//추가
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
		for (int i=1; i<=100; i++) {
			queue.add(i);
		}
		
		for (int i=1; i<100; i++) {
			System.out.print(queue.poll() + ", ");
		}
		System.out.print(queue.poll());
		
		System.out.println("Stack");
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		
		for (int i=0; i<100; i++) {
			stack.push(i);
			
		}
		System.out.println(stack);
		
		for (int i= 0; i<100; i++) {
			System.err.print(stack.pop() + " ");
		}
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();		//강제성 O
//		LinkedList linkedList2 =new LinkedList();						//강제성 X
		
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(400);
		linkedList.add(500);
		System.out.println(linkedList);
		
	}
}
