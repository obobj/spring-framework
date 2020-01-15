package com.luban.anno;

import com.luban.importSelector.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Import(MyImportBeanDefinitionRegistrar.class)
@Retention(RetentionPolicy.RUNTIME)
@Import(MyImportSelector.class)
public @interface LuBanScan {
}
