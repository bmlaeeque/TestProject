package com.coreJava.creatingCustomAnnotation;
/**
 * 
 * here i m change  Priority medium to high ,and createdBy bml to mk and add some tags  ....
 *
 */
@customAnnotation(priority=customAnnotation.Priority.high , createdBy="mk",tags={"java","annotation"})

//@methodAnnotation:- if i m putting this annotation to class level then i will throw compile-time error
public class applyingCustomAnnotation {
	@methodAnnotation
	public static void main(String[] args) {
		

	}
	/**
	 * here i m changing enable true to false 
	 * 
	 */
	@methodAnnotation(enable=false)
	public void m1(){
		
	}

}
