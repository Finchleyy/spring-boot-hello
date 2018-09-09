package com.ypw.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName TableAnnotation
 * @Description TODO
 * @Author yupengwu
 * @Date 2018/9/9 15:11
 * @Version 1.0
 **/
@Target(value = {ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface TableAnnotation {
    String value();
}
