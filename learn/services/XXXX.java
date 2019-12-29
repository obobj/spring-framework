package services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
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
public class XXXX implements InstantiationAwareBeanPostProcessor {

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return false;
    }
}
