package com.coreJava.innerclass;
/**
 * Q)what is static-Inner Class?
 * 		a static class present in a class 
 */
public class staticInnerClass {
	static int data = 30;

	static class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		staticInnerClass.Inner obj = new staticInnerClass.Inner();
		obj.msg();
	}
}
