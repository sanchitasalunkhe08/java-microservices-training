package com.send;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

import com.send.entity.Product;

@SpringBootApplication
@EnableJms
public class ActivemqProducerApplication {
	
	private static final String MESSAGE_QUEUE ="MyQueue";

	public static void main(String[] args) {
		//launch the app
		ConfigurableApplicationContext context = SpringApplication.run(ActivemqProducerApplication.class, args);
		
		//to get the jms template bean reference
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
		for(int i = 1; i<=10; i++)
		{
			Product product = new Product();
			product.setProductId(i);
			product.setName("Macbook 14 Pro");
			product.setQuantity(10);
			
			//send the message
			System.out.println("sending product with id" + i);
			jmsTemplate.convertAndSend(MESSAGE_QUEUE, product);
		}
	}

}
