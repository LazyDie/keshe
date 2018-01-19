package com.ipower365.saas.basic.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import com.ipower365.saas.basic.constants.Constants;

@Retention(RetentionPolicy.RUNTIME)
public @interface DateTimeFormat {

	String pattern() default Constants.DEFULT_DATE_FORMATTER;

}
