package com.coreJava.oop;
class A{
	public void m1(){
		System.out.println("super.m1()");
	}
}
public class runtimpoly2 extends A{
	/*protected void m1(){ //////////////////////Protected::compile time error
		System.out.println("sub.m1()");
	}*/
	/*private void m1(){ ////////////////////////private::compile time error
		System.out.println("sub.m1()");
	}*/
	/*void m1(){/////////////////////////////////defoult::compile time error
		System.out.println("sub.m1()");
	}*/
	
	public void m1(){
		System.out.println("sub.m1()");
	}
	public static void main(String[] args) {
		A a=new runtimpoly2();
		a.m1();
	}

}
