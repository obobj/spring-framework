package com.luban.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAOP {

	@Before(value = "execution(public * com.luban.aop.AutoAOP.test(..))")
	public void checkAndProcessDeviceData1() {
		System.out.println("AutoAOPBefore");
	}

	@Before(value = "execution(public * com.luban.aop.CycleAutoAOP.test(..))")
	public void checkAndProcessDeviceData() {
		System.out.println("CycleAutoAOPBefore");
	}

	@Before(value = "execution(public * com.luban.aop.TestJDKAOPImpl.test(..))")
	public void checkAndProcessDeviceData3() {
		System.out.println("TestJDKAOPImplBefore");
	}
}
