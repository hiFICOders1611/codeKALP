package com.hificoder.hificoderSpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication 
@ComponentScan({"com.hificoder.controller"})
@ComponentScan({"com.hificoder.service"})
@ComponentScan({"com.hificoder.config"})
public class HificoderSparkApplication {

	public static void main(String[] args) {
		SpringApplication.run(HificoderSparkApplication.class, args);
	}

}
