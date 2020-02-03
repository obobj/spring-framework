package com.luban.springEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MailBean {

	@Autowired
	ApplicationContext applicationContext;

	public void sendMail() {
		applicationContext.publishEvent(new SpringMailEvent(applicationContext));
	}
}
