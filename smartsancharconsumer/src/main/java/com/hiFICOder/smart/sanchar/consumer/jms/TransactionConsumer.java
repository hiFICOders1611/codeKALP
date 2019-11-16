package com.hiFICOder.smart.sanchar.consumer.jms;

import java.io.Serializable;
import java.util.Arrays;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.DefaultUriBuilderFactory.EncodingMode;

import com.hiFICOder.smart.sanchar.api.model.EntryTransaction;
import com.hiFICOder.smart.sanchar.api.model.ExitTransaction;


@Component
public class TransactionConsumer {
	
	@Value("${mongo.api}")
	String mongoApi;

	@JmsListener(destination = "${jms.queue.destination}")
	public void receive(Message message) throws JMSException {
		System.out.println("message received.........");
		ObjectMessage message1 = (ObjectMessage)message;
		
		String baseUrl = mongoApi + "/travel-transaction";
		DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory(baseUrl);
		factory.setEncodingMode(EncodingMode.TEMPLATE_AND_VALUES);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setUriTemplateHandler(factory);
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		restTemplate.getForObject(baseUrl, String.class, entity);

		// Validate Smart Card Eligibility.
		restTemplate.getForObject(baseUrl, String.class, entity);
		
		if (message1.getObject() instanceof EntryTransaction) {
			System.out.println("Recieved Message: EntryTransaction " );
		} else if (message1.getObject() instanceof ExitTransaction) {
			System.out.println("Recieved ExitTransaction: ");
		} else if (message1 instanceof Serializable) {
			System.out.println("Recieved Serializable: ");
		} else {
			System.err.println("Message Type Unkown !");
		}
	}

}
