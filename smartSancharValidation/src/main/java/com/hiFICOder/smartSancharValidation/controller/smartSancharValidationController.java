package com.hiFICOder.smartSancharValidation.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.atomic.AtomicLong;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hiFICOder.smartSancharValidation.model.SancharCard;

@RestController
@RequestMapping("/smartcard")
public class smartSancharValidationController {
	
	static String mongoDbPort = "8102";

    @RequestMapping(value="{rfid}")
    public String smartCard(@PathVariable("rfid") String rfid) {
   	System.out.println("ID is " + rfid);
    
   	RestTemplate restTemplate = new RestTemplate();
   	URI uri;
    ResponseEntity<SancharCard> result = null;
    final String baseUrl = "http://localhost:" + mongoDbPort + "/smartcard/" + rfid;
    
	try {
		uri = new URI(baseUrl);
		result = restTemplate.getForEntity(uri, SancharCard.class);
		SancharCard card = result.getBody();
		System.out.println(result.getBody().getBalance());
		if(card.getBalance() > 50) {
			return("Approved");
		}
				
	} catch (URISyntaxException e) {
		e.printStackTrace();
	}
   
    return "Declined";

     }
}   
    