package com.hiFICOder.smartsanchar.model;

import java.io.Serializable;
import java.sql.Date;

public class ExitTransaction implements Serializable {
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

	public Date getTimeEntry() {
		return timeEntry;
	}

	public void setTimeEntry(Date timeEntry) {
		this.timeEntry = timeEntry;
	}

	private String rfid;
	private String deBoardingLocId;

	public String getDeBoardingLocId() {
		return deBoardingLocId;
	}

	public void setDeBoardingLocId(String deBoardingLocId) {
		this.deBoardingLocId = deBoardingLocId;
	}

	private Date timeEntry;
}
