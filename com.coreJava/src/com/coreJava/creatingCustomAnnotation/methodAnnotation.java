package com.coreJava.creatingCustomAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//it tell its work on runtime 
@Target(ElementType.METHOD)//it tell its method level annotation
public @interface methodAnnotation {
	public boolean enable() default true;//declaring one property in annotaion 

}
