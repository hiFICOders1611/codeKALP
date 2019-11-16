package com.hiFICOder.smart.sanchar.consumer.jms;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.hiFICOder.smart.sanchar.api.model.EntryTransaction;
import com.hiFICOder.smart.sanchar.api.model.ExitTransaction;


@Component
public class TransactionConsumer {

	@JmsListener(destination = "${jms.queue.destination}")
	public void receive(Message message) throws JMSException {
		System.out.println("message received.........");
		ObjectMessage message1 = (ObjectMessage)message;
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
