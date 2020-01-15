package com.luban.dao;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

@Repository
public class IndexDao implements ApplicationContextAware, Dao {

	private ApplicationContext applicationContext;

	@Override
	public void query() {
		System.out.println("indexDao");
		// 可以解决原型
//		applicationContext.getBean("xxx");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
