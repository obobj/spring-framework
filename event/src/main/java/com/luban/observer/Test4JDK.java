package com.luban.observer;

import com.luban.app.AppConfig;
import com.luban.springEvent.MailBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4JDK {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(AppConfig.class);
		ac.start();

		ac.getBean(MailBean.class).sendMail();

		Movie4JDK movie4JDK = new Movie4JDK();

		Master4JDK master4JDK = new Master4JDK();

		movie4JDK.addObserver(master4JDK);

		movie4JDK.move();
	}
}
