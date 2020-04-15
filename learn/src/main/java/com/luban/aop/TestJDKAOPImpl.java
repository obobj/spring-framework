package com.luban.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestJDKAOPImpl implements TestJDKAOP{

	@Autowired
	TestJDKAOP testJDKAOP;

	@Override
	public void test() {
		System.out.println("TestJDKAOPImpl");
	}

	@PostConstruct
	public void init(){
		System.out.println("init");
		testJDKAOP.test();
	}
}
