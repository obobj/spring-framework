package com.luban.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author luoxin
 */
@Component
//@DependsOn("testBeanPostProcessor1")
public class TestBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("indexDao".equals(beanName)) {
			System.out.println("BeforeInitialization0");
		}
		// 这里还可以使用代理，但是必须返回bean
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("indexDao".equals(beanName)) {
			System.out.println("AfterInitialization0");
		}
		// 这里还可以使用代理，但是必须返回bean
		return bean;
	}

	@Override
	public int getOrder() {
		return 101;
	}
}
