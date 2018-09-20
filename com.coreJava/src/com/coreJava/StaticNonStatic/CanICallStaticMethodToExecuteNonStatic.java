package com.coreJava.StaticNonStatic;

public class CanICallStaticMethodToExecuteNonStatic {
	public static void m(){
		System.out.println("Static m()");
		/////////////////////////////////////////////Can i call Non-static method from static method
		
		//m1();//////////////////////////////////////no we can't call  non-static method from static method because static m() gets memory
		/////////////////////////////////////////////at the time of loading in to jvm and Non-Static variable gets memory when is create 
	}
	public void m1(){
		System.out.println("N-static m()");
	}
	public static void main(String[] args) {

	}

}
