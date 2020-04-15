package com.luban.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CycleAutoAOP {

	@Autowired
	AutoAOP autoAOP;

	public void test() {
		System.out.println("CycleAutoAOP");
	}
}
