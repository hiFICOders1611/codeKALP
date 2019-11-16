package com.hiFICOder.smart.sanchar.api.model;

import java.io.Serializable;
import java.sql.Date;

public class EntryTransaction implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	private String validationStatus;

	public String getValidationStatus() {
		return validationStatus;
	}

	public void setValidationStatus(String validationStatus) {
		this.validationStatus = validationStatus;
	}
}
