package com.yash.collectionProgram.CollectionTask8;

public class AverageProduction {
	int id;
	int prod_per_day;
	public AverageProduction(int id, int prod_per_day) {
		super();
		this.id = id;
		this.prod_per_day = prod_per_day;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProd_per_day() {
		return prod_per_day;
	}
	public void setProd_per_day(int prod_per_day) {
		this.prod_per_day = prod_per_day;
	}
	@Override
	public String toString() {
		return "AverageProduction [id=" + id + ", prod_per_day=" + prod_per_day + "]";
	}
	
	
}
