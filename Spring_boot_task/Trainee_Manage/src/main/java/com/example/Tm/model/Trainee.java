package com.example.Tm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class Trainee {
	@Id
	private int tId;
	private String tName;
	private String bName;
	public Trainee() {
		super();
	}
	public Trainee(int tId, String tName, String bName) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.bName = bName;
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	
	
	
}
