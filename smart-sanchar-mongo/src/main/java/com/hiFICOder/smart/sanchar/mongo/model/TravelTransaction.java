package com.hiFICOder.smart.sanchar.mongo.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document
public class TravelTransaction {

	@Id
	private String rfid;

	private String boardingLocId;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date timeEntry;
	
	private String deBoardingLocId;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date timeExit;

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

	public String getDeBoardingLocId() {
		return deBoardingLocId;
	}

	public void setDeBoardingLocId(String deBoardingLocId) {
		this.deBoardingLocId = deBoardingLocId;
	}

	public Date getTimeExit() {
		return timeExit;
	}

	public void setTimeExit(Date timeExit) {
		this.timeExit = timeExit;
	}	
	
	
}
