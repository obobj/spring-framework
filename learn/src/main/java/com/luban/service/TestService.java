package com.luban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TestService {

	@Autowired
	private OrderService orderService;

	@Autowired
	private IndexService indexService;
}
