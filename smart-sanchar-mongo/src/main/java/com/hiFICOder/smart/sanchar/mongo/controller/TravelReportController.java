package com.hiFICOder.smart.sanchar.mongo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hiFICOder.smart.sanchar.mongo.dal.TravelReportDAL;

@RestController
@RequestMapping(value = "/travel-report")
public class TravelReportController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final TravelReportDAL travelReportDAL;

	public TravelReportController(TravelReportDAL travelReportDAL) {
		this.travelReportDAL = travelReportDAL;
	}

	@RequestMapping(value = "/{rfid}", method = RequestMethod.GET)
	public Object getAllTravelReport(@PathVariable String rfid) {
		return travelReportDAL.getTravelReportById(rfid);
	}
}
