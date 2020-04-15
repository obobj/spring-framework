package com.luban.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutoAOP {

	@Autowired
	CycleAutoAOP cycleAutoAOP;

	public void test() {
		System.out.println("AutoAOP");
	}
}
