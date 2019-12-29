package services;

import org.springframework.beans.BeansException;
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
public class Y implements ApplicationContextAware {

    public Y() {
        System.out.println("y create");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Aware");
    }

//    @PostConstruct
//    public void lifeInit() {
//        System.out.println("init" + x);
//    }
}
