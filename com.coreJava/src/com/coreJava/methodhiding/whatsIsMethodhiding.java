package com.coreJava.methodhiding;
class SuperClass{
	
	/**
	 * 1)what is method hiding 
	 * 2) can we call static method by using only method name?
	 * 		no, we can't invoke static method by only his name it throw CE
	 */
	static void m1(){
		System.out.println("static method of super-class");
	}
}
public class whatsIsMethodhiding extends SuperClass {
	static void m1(){
		System.out.println("Static method of sub-class");
	}
	public static void main(String[] args) {
		//m1();
		
		SuperClass.m1();//we can call super class method by using classname.methodname();  
		whatsIsMethodhiding.m1();//we can call sub class method by using classname.methodname();
		

	}

}
