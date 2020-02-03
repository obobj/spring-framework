package com.luban.test;

import com.luban.app.AppConfig;
import com.luban.dao.OrderTabDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test{
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac =
				new AnnotationConfigApplicationContext(AppConfig.class);
//		ac.register(AppConfig.class);
		// 如果这个类又加了@Compoent，将会执行两次
//		ac.addBeanFactoryPostProcessor(new MyBeanDefinitionRegistryPostProcessor());
//		ac.refresh();
//		ac.register(IndexDao.class);
//		ac.register(TestBeanPostProcessor1 .class);
//		ac.register(TestBeanPostProcessor.class);
//		ac.register(AppConfig.class);
//		ac.refresh();
//		ac.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());
//		ac.refresh();
//		IndexDao3 bean = ac.getBean(IndexDao3.class);
//		bean.query();

//		Dao dao1 = (Dao) ac.getBean("indexDao");
//		dao1.query();
//
//		Enhancer enhancer = new Enhancer();
//		enhancer.setSuperclass(IndexDao.class);
//		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
//
//		// 对代理对象所有方法进行拦截
//		enhancer.setCallback(new TestMethodCallback());
//		IndexDao indexDao = (IndexDao) enhancer.create();
//		indexDao.query();

		ac.getBean(OrderTabDao.class).update("");


	}


}
