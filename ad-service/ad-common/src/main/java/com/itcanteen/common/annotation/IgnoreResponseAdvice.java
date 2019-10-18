package com.itcanteen.common.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 * Target代表自定义的注解能够应用在类上和方法是
 * Retention运行时注解
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreResponseAdvice {
}
