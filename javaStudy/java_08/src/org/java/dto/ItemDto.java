package org.java.dto;

import java.time.LocalDateTime;

public class ItemDto {
	private int itemId;			//자동 증부
	private String itemName;
	private String itemDetail;
	private String category;
	private int itemPrice;
	private int inventory;
	private int hit;			//기본 1
	
	private LocalDateTime createDate;	//입고
	private LocalDateTime updateDate;	//출고
	
	public ItemDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemDto(int itemId, String itemName, String itemDetail, String category, int itemPrice, int inventory,
			int hit, LocalDateTime createDate, LocalDateTime updateDate) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemDetail = itemDetail;
		this.category = category;
		this.itemPrice = itemPrice;
		this.inventory = inventory;
		this.hit = hit;
		this.createDate = createDate;
		this.updateDate = updateDate;
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

	public String getItemDetail() {
		return itemDetail;
	}

	public void setItemDetail(String itemDetail) {
		this.itemDetail = itemDetail;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public LocalDateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "ItemDto [itemId=" + itemId + ", itemName=" + itemName + ", itemDetail=" + itemDetail + ", category="
				+ category + ", itemPrice=" + itemPrice + ", inventory=" + inventory + ", hit=" + hit + ", createDate="
				+ createDate + ", updateDate=" + updateDate + "]";
	}
	
	
	
	
}
