package com.hiFICOder.smart.sanchar.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hiFICOder.smart.sanchar.api.model.ExitTransaction;
import com.hiFICOder.smart.sanchar.api.producer.ArtemisProducer;

@RestController
public class TravelCardExitController {
	@Autowired
	ArtemisProducer producer;

	@RequestMapping(value = "smarCardExit", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody Boolean saveSmartCardExit(@RequestBody ExitTransaction exitTransaction) {
		// Post Message in MQ.
		producer.send(exitTransaction);
		return true;
	}

}
