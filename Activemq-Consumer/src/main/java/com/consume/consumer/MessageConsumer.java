package com.consume.consumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.consume.entity.Product;

@Component
public class MessageConsumer {
	
	private static final String MESSAGE_QUEUE="MyQueue";
	@JmsListener(destination = MESSAGE_QUEUE )
	public void receiveMessage(Product product) {
		System.out.println("Consumer: " +product);
	}
}
