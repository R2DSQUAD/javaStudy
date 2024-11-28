package org.java.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		System.out.println("Map<K,V>");
		
		Map<String, List<String>> boardMap = new HashMap<String, List<String>>();
		
		//일반 게시글, 비밀게시글 키로 -> Map에 추가
		List<String> board1 =new ArrayList<String>();
		board1.add("일반게시글1");
		board1.add("일반게시글2");
		board1.add("일반게시글3");
		board1.add("일반게시글4");
		board1.add("일반게시글5");
//		System.out.println(board1);
		
		List<String> board2 =new ArrayList<String>();
		board2.add("비밀게시글1");
		board2.add("비밀게시글2");
		board2.add("비밀게시글3");
		board2.add("비밀게시글4");
		board2.add("비밀게시글5");
//		System.out.println(board2);
		
		boardMap.put("일반 게시판", board1);
		boardMap.put("비밀 게시판", board2);
		
		Set<String> set = boardMap.keySet();
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String keyStr = iterator.next();// key  -> get(key)
			
			System.out.println(keyStr);
			if(keyStr.equals("일반 게시판")) {
				List<String> list= boardMap.get(keyStr);			
				for(String str: list) {
					System.out.println(str);
				}				
			}
			System.out.println();
		}
	}
}
