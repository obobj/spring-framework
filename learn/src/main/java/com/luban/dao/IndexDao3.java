package com.luban.dao;

import com.luban.importSelector.MyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Proxy;

public class IndexDao3 implements BeanPostProcessor, Dao {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("indexDao".equals(beanName)) {
			bean = Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class<?>[]{Dao.class},
					new MyInvocationHandler(bean));
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

	@Override
	public void query() {
		System.out.println("indexDao3");
	}

}
