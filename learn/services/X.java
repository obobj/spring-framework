package services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * testmaven
 *
 * @author lx
 * @version V1.0
 * @date 2019/12/2
 * @email vinicolor.violet.end@gmail.com
 * Description:
 */
@Component
public class X implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
	Y y;

    public X() {
        System.out.println("x create");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void testProxy() {

    }
}
