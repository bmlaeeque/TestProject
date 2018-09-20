package com.coreJava.creatingCustomAnnotation;
/**
 * Q)What is Annotation in java?
 * 		Annotation is used to provide information about program
 * Q)What is compile time Annotation in java?
 * 		@Overide:--its compile-time annotation
 * Q)What are the types of Annotation?
 * 		1)Marker Annotation:-it does not contain any member(variable & methods) and and any data, its used
 * 							 to determine weather its present or not
 * 						exp:-@Overide
 * 
 * 		2. Single value Annotations:
				These annotations contain only one member and allow a shorthand form of specifying the value of the member.
				exp: - @TestAnnotation(“testing”);
		3. Full Annotations:
				These annotations consist of multiple data members/ name, value, pairs.

				Exp:- @TestAnnotation(CreatedBy=”bml”, lastModified=”02/02/2018”)
 * 
 * 
 * 
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * 
 * we use this @Retention() to decide this annotation is acts as in Runtime or compile-time
 *  
 *  so here we are using this annotation for runtime
 *
 */
@Retention(RetentionPolicy.RUNTIME)
/**
 *@Target(ElementType.TYPE):---here i m using this Annotation to declare this annotation is class level or method level 
 * 
 *
 */
@Target(ElementType.TYPE)
public @interface customAnnotation {
	
	//Here i m creating a one enum class for constant and taking three constant varible(its by default  static and final)
	public enum Priority{
		low,medium,high
	}
	/*
	 * Here we created for one property for this annotation "priority()" of "Priority" type
	 * 
	 *  and here i m providing default value to thid=s property is "default Priority.medium"
	 *  
	 * 
	 */
	Priority priority() default Priority.medium;
	
	/**
	 * Here i m declaring different types of property in Annotation
	 *   exp:- 		
	 *   		tags()
	 *   		createdBy()
	 *   		lastModified()
	 * 
	 * 
	 */
	String[] tags() default "";
	
	String[] createdBy() default "bml";
	
	String lastModified() default "01/o1/2018";
	
	
}
