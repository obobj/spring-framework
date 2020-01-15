package com.luban.app;

import com.luban.anno.EnableLuBan;
import com.luban.dao.IndexDao;
import com.luban.dao.IndexDao1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author luoxin
 * <p>
 * 如果有@Configuration，spring将会利用cglib实现代理
 * 会实现beanAware的接口，会注入beanFactory，调用方法时
 * 将会判断方法是不是第一次，然后如果不是第一次，将会从beanFactory中取出来
 */ //@LuBanScan
//@Configuration
//@Import(MyImportSelector.class)
@Configuration
@ComponentScan("com.luban")
@EnableLuBan
/**
 * 这个注解利用了Import技术，完成了一个后置处理器的注册
 */
@EnableAspectJAutoProxy
public class AppConfig {

	@Bean
	public IndexDao1 indexDao1() {
		return new IndexDao1();
	}

	@Bean
	public IndexDao indexDao() {
		indexDao1();
		return new IndexDao();
	}

}
