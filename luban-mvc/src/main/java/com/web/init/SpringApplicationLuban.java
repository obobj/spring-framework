package com.web.init;

import com.luban.app.AppConfig;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringApplicationLuban implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return false;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		return null;
	}


	public static void run() throws LifecycleException {
		AnnotationConfigWebApplicationContext ac =
				new AnnotationConfigWebApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();

//		File base = new File(System.getProperty("java.io.tmpdir"));

		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);
		// 但是.addWebapp表示这是一个web项目，web项目就需要
		// contextPath 表示tomcat的访问路径
		// 第二个参数就是项目的web目录
		// 所以这里不能用addwebapp（springboot当中也没有这么做）
		// 添加了后就是web项目了，就会调用一个钩子
		// SpringServletContainerInitializer，这个就是SPI拓展
		// 这个就是springboot为什么不支持jsp
		// 使用.addContext()就不会
//		tomcat.addWebapp("/", "d:/index.html");

		tomcat.addContext("/", "~/");

		DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);

//		Tomcat.addServlet(rootCtx, "luban", dispatcherServlet).setLoadOnStartup(1);

		Wrapper mvc = tomcat.addServlet("/", "mvc", dispatcherServlet);

		mvc.addMapping("*.do");
		mvc.setLoadOnStartup(1);

//		rootCtx.addServletMapping;
//		rootCtx.addServletMappingDecoded("/", "luban");
//		rootCtx.addServletMappingDecoded();

		// tomcat启动后会执行静态快
		// 静态快将会加载一个配置文件，有8和key，先拿出来
		tomcat.start();
		tomcat.getServer().await();
	}
}
