package com.luban.service;

import org.springframework.stereotype.Component;

@Component
public class IndexService {

	public IndexService() {
		System.out.println();
	}

	public void setA(OrderService orderService) {
		System.out.println("setA(OrderService orderService)");
	}
}
