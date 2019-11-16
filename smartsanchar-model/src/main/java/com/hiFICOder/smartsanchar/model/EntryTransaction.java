package com.hiFICOder.smartsanchar.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class EntryTransaction {

	@Getter
	@Setter
	private String rfid;

	@Getter
	@Setter
	private String boardingLocId;

	@Getter
	@Setter
	private Date timeEntry;
}
