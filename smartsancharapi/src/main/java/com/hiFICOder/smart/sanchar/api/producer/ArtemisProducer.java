package com.hiFICOder.smart.sanchar.api.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.hiFICOder.smart.sanchar.api.model.EntryTransaction;

@Component
public class ArtemisProducer {
	@Autowired
	JmsTemplate jmsTemplate;

	@Value("${jms.queue.destination}")
	String destinationQueue;

	public void send(EntryTransaction msg) {
		jmsTemplate.convertAndSend(destinationQueue, msg);
	}
}