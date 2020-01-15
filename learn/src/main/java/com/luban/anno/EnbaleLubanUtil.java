package com.luban.anno;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author luoxin
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface EnbaleLubanUtil {
	String uname() default "root";
}
