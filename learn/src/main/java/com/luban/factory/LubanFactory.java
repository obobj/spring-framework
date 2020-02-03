//package com.luban.factory;
//
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
//import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
//import org.springframework.beans.factory.support.GenericBeanDefinition;
//import org.springframework.stereotype.Component;
//
//@Component
//public class LubanFactory implements BeanFactoryPostProcessor {
//
//	@Override
//	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		GenericBeanDefinition index = (GenericBeanDefinition) beanFactory.getBeanDefinition("luban");
//		index.getConstructorArgumentValues().addGenericArgumentValue("com.luban.service.lubanService");
//		index.setPropertyValues();
//	}
//}
