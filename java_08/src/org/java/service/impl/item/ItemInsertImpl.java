package org.java.service.impl.item;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.java.controller.ItemService;
import org.java.dto.ItemDto;

public class ItemInsertImpl implements ItemService {

	@Override
	public void excuteQueryService() {
		System.out.println("상품 등록");
		Scanner sc = new Scanner(System.in);
		boolean bool = false;
		while (!bool) {
			System.out.println("상품을 등록합니다. (Y/N)");
			String quest = sc.next();
			if (quest.equals("y") || quest.equals("Y")) {
				int itemId = 1;
				int hit = 1;
				System.out.print("상품 이름 : ");
				String itemName = sc.next();
				System.out.print("상품 상세정보 : ");
				String itemDetail = sc.next();
				System.out.print("상품 종류 : ");
				String category = sc.next();
				System.out.print("상품 가격 : ");
				int itemPrice = sc.nextInt();
				System.out.print("재고 : ");
				int inventory = sc.nextInt();
				ItemDto item = new ItemDto(itemId, itemName, itemDetail, category, itemPrice, inventory, hit, LocalDateTime.now(), null);
				System.out.println(item.toString());
			} else {
				System.out.println("종료합니다.");
				bool = true;
				break;
			}
		}
		sc.close();

	}

	public ItemInsertImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

}
