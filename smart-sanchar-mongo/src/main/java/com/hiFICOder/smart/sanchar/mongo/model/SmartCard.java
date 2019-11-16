package com.hiFICOder.smart.sanchar.mongo.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class SmartCard {

	@Id
	private String smartCardId;
	private long balance;
	private Date creationDate = new Date();
	
	public String getSmartCardId() {
		return smartCardId;
	}
	public void setSmartCardId(String smartCardId) {
		this.smartCardId = smartCardId;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
