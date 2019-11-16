package com.hiFICOder.smart.sanchar.mongo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hiFICOder.smart.sanchar.mongo.dal.SmartCardRepository;
import com.hiFICOder.smart.sanchar.mongo.model.SmartCard;

@RestController
@RequestMapping(value = "/smartcard")
public class SmartCardController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	private final SmartCardRepository smartCardRepository;

	public SmartCardController(SmartCardRepository smartCardRepository) {
		this.smartCardRepository = smartCardRepository;
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public SmartCard addNewSmartCards(@RequestBody SmartCard smartCard) {
		LOG.info("Saving smartCard.");
		return smartCardRepository.save(smartCard);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<SmartCard> getAllSmartCards() {
		LOG.info("Getting all smartCards.");
		return smartCardRepository.findAll();
	}

	@RequestMapping(value = "/{smartCardId}", method = RequestMethod.GET)
	public SmartCard getSmartCard(@PathVariable String smartCardId) {
		LOG.info("Getting smartCard with ID: {}.", smartCardId);
		return smartCardRepository.findOne(smartCardId);
	}

}