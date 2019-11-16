package com.hiFICOder.smartSancharValidation.controller;

import java.util.concurrent.atomic.AtomicLong;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hiFICOder.smartSancharValidation.model.SmartCard;

@RestController
@RequestMapping("/smartcard")
public class smartSancharValidationController {
	

    @RequestMapping()
    public String smartCard(@PathParam("rfid") String rfid) {
//    	System.out.println("ID is " + rfid);
        return "Active";

     }
}   
    
