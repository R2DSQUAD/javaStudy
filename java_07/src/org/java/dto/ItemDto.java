package org.java.dto;

import java.time.LocalDateTime;

public class ItemDto {

	private int itemId; // 중복불가 -> 자동 증감
	private String itemName;
	private int itemPrice;
	private String itemDetail;
	private int inventory;
	// 기본 -> 생산날짜, 수정날짜
	private LocalDateTime createTime; // 자동
	private LocalDateTime updateTime; // 자동
	
	public ItemDto() {
		// TODO Auto-generated constructor stub
	}

	public ItemDto(int itemId, String itemName, int itemPrice, String itemDetail, int inventory,
			LocalDateTime createTime, LocalDateTime updateTime) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemDetail = itemDetail;
		this.inventory = inventory;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "상품정보: [상품ID = " + itemId + ", 상품이름 = " + itemName + ", 상품가격 = " + itemPrice + ", 상품 상제 정보 = "
				+ itemDetail + ", 상품 재고 = " + inventory + ", 입고일 = " + createTime + ", 입고 수정일 = " + updateTime
				+ "]";
	}

	// 기본 생성자

	// 모든 필드 매개인자 -> 생성자

}
