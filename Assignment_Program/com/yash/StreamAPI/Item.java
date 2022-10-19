package com.yash.StreamAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Item {
	private int itemid;
	private String iname;
	private LocalDate date_of_manufacturing, date_of_expiry;
	private float price;

	public Item() {
		super();
	}

	public Item(int itemid, String iname, LocalDate date_of_manufacturing, LocalDate date_of_expiry,
			float price) {
		super();
		this.itemid = itemid;
		this.iname = iname;
		this.date_of_manufacturing = date_of_manufacturing;
		this.date_of_expiry = date_of_expiry;
		this.price = price;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public LocalDate getDate_of_manufacturing() {
		return date_of_manufacturing;
	}

	public void setDate_of_manufacturing(LocalDate date_of_manufacturing) {
		this.date_of_manufacturing = date_of_manufacturing;
	}

	public LocalDate getDate_of_expiry() {
		return date_of_expiry;
	}

	public void setDate_of_expiry(LocalDate date_of_expiry) {
		this.date_of_expiry = date_of_expiry;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", iname=" + iname + ", date_of_manufacturing=" + date_of_manufacturing
				+ ", date_of_expiry=" + date_of_expiry + ", price=" + price + "]";
	}

}
