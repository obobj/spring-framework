package com.luban.beanFactoryProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author luoxin
 */
@Component
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition orderService = (GenericBeanDefinition) beanFactory.getBeanDefinition("indexService");
		orderService.setAutowireMode(2);
	}
}
