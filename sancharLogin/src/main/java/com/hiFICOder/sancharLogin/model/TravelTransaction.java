package com.hiFICOder.sancharLogin.model;

import java.io.Serializable;
import java.sql.Date;

public class TravelTransaction implements Serializable {
	
	private String rfid;
	private String boardingLocId;
	private String deBoardingLocId;
	private Date timeEntry;
	private double fare;
	private String validationStatus;
	
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
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String getValidationStatus() {
		return validationStatus;
	}
	public void setValidationStatus(String validationStatus) {
		this.validationStatus = validationStatus;
	}

}
