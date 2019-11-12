package com.hificoder.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hificoder.service.WordCountService;

@RestController
public class WordCountController {
 
    @Autowired
    WordCountService service;
 
    @RequestMapping(value = "/wordcount", method = RequestMethod.POST)
    public Map<String, Long> count( @RequestBody String reqBody) {
        List<String> wordList = Arrays.asList(reqBody.split("\\s+"));
        return service.getCount(wordList);
    }
}