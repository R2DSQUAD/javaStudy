package org.java.controller;

import java.time.LocalDateTime;

import org.java.dto.ItemDto;

public class ItemController {
	public static void main(String[] args) {
		ItemDto item1 = new ItemDto(1, "A1상품", 30000, "A상품 상세정보", 1000, LocalDateTime.now(), null);
		System.out.println(item1.toString());
		
		ItemDto item2 = new ItemDto(2, "A2상품", 40000, "A상품 상세정보", 2000, LocalDateTime.now(), null);
		System.out.println(item2.toString());
		
		ItemDto item3 = new ItemDto(3, "A3상품", 50000, "A상품 상세정보", 3000, LocalDateTime.now(), null);
		System.out.println(item3.toString());
		
		ItemDto item4 = new ItemDto(4, "A4상품", 60000, "A상품 상세정보", 4000, LocalDateTime.now(), null);
		System.out.println(item4.toString());
		
		ItemDto item5 = new ItemDto(5, "A5상품", 70000, "A상품 상세정보", 5000, LocalDateTime.now(), null);
		System.out.println(item5.toString());
		
	}
}
