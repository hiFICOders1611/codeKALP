package com.hiFICOder.smart.sanchar.api.model;

import java.sql.Date;

public class ExitTransaction {

	private String rfid;
	private String deBoardingLocId;
	private Date timeEntry;
	
	public String getRfid() {
		return rfid;
	}
	public void setRfid(String rfid) {
		this.rfid = rfid;
	}
	public String getDeBoardingLocId() {
		return deBoardingLocId;
	}
	public void setDeBoardingLocId(String deBoardingLocId) {
		this.deBoardingLocId = deBoardingLocId;
	}
	public Date getTimeEntry() {
		return timeEntry;
	}
	public void setTimeEntry(Date timeEntry) {
		this.timeEntry = timeEntry;
	}
	
	
	
}
