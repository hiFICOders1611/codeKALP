package com.hiFICOder.smart.sanchar.api.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.DefaultUriBuilderFactory.EncodingMode;

import com.hiFICOder.smart.sanchar.api.model.EntryTransaction;
import com.hiFICOder.smart.sanchar.api.producer.ArtemisProducer;

@RestController
public class TravelCardEntryController {
	@Autowired
	ArtemisProducer producer;
	@Value("${validation.api}")
	String validationApi;

	@RequestMapping(value = "smarCardEntry", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody String saveSmartCardEntry(@RequestBody EntryTransaction entryTransaction) {
		// Validate Smart Card Eligibility.
		String baseUrl = validationApi + entryTransaction.getRfid();
		DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory(baseUrl);
		factory.setEncodingMode(EncodingMode.TEMPLATE_AND_VALUES);

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setUriTemplateHandler(factory);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		restTemplate.getForObject(baseUrl, String.class, entity);
		// Post Message in MQ.
		String status = restTemplate.getForObject(baseUrl, String.class, entity);
		if (status.equals("Active")) {
			// Post Message in MQ.
			producer.send(entryTransaction);
			return "Success";
		}
		return "Failure";
	}

}
