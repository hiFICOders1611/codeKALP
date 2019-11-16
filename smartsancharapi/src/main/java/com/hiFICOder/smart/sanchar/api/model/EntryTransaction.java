package com.hiFICOder.smart.sanchar.api.model;

import java.io.Serializable;
import java.sql.Date;

public class EntryTransaction implements Serializable{
	public String getRfid() {
		return rfid;
	}

	public void setRfid(String rfid) {
		this.rfid = rfid;
	}

	public String getBoardingLocId() {
		return boardingLocId;
	}

	public void setBoardingLocId(String boardingLocId) {
		this.boardingLocId = boardingLocId;
	}

	public Date getTimeEntry() {
		return timeEntry;
	}

	public void setTimeEntry(Date timeEntry) {
		this.timeEntry = timeEntry;
	}

	private String rfid;
	private String boardingLocId;
	private Date timeEntry;
}
