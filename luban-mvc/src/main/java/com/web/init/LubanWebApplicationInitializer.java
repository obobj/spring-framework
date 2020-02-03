package com.web.init;

import com.luban.app.AppConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class LubanWebApplicationInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();

		ac.register(AppConfig.class);
		ac.refresh();

		DispatcherServlet dispatcherServlet = new DispatcherServlet(ac);
		ServletRegistration.Dynamic registration = servletContext.addServlet("mvc", dispatcherServlet);
		registration.addMapping("*.do");
		registration.setLoadOnStartup(1);

		// 注意这里就是一定是web项目
		// 初始化spring的环境和springweb环境
		System.out.println("xxxxxx");
	}
}
