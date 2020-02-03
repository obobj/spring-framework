package com.luban.app;

import com.web.init.SpringApplicationLuban;
import org.apache.catalina.LifecycleException;

public class App {

	public static void main(String[] args) throws LifecycleException {
		SpringApplicationLuban.run();
	}

//	@Bean
//	public HttpMessageConverter httpMessageConverter() {
////		return new HttpMessageConverter(new FastJson) {
//		return null;
//	}
}

