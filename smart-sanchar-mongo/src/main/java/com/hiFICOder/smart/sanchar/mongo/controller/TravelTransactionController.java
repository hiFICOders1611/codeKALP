package com.hiFICOder.smart.sanchar.mongo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hiFICOder.smart.sanchar.mongo.dal.TravelTransactionRepository;
import com.hiFICOder.smart.sanchar.mongo.model.TravelTransaction;

@RestController
@RequestMapping(value = "/travel-transaction")
public class TravelTransactionController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final TravelTransactionRepository travelTransactionRepository;
	
	public TravelTransactionController(TravelTransactionRepository travelTransactionRepository) {
		this.travelTransactionRepository = travelTransactionRepository;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public TravelTransaction addNewTravelTransactions(@RequestBody TravelTransaction travelTransaction) {
		LOG.info("Saving travelTransaction.");
		return travelTransactionRepository.save(travelTransaction);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<TravelTransaction> getAllTravelTransactions() {
		LOG.info("Getting all travelTransactions.");
		return travelTransactionRepository.findAll();
	}

	@RequestMapping(value = "/{travelTransactionId}", method = RequestMethod.GET)
	public TravelTransaction getTravelTransaction(@PathVariable String travelTransactionId) {
		LOG.info("Getting travelTransaction with ID: {}.", travelTransactionId);
		return travelTransactionRepository.findOne(travelTransactionId);
	}

}