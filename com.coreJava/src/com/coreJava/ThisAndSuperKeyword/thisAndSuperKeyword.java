package com.coreJava.ThisAndSuperKeyword;
class Superrrr{
	public void mm(){
		System.out.println("super m()");
	}
}
public class thisAndSuperKeyword extends Superrrr{
	public void m(){
		System.out.println("sub m()");
	}
	public void m1(){
		System.out.println(" sub m1()");
	}
	
	
	
	public void m2(){
		super.mm();/////and here m calling m() of super class by using super keyword
		
		m1();//////////////and here i m calling m1() so internally it use this keyword to invoke the m1() from current class
	}
	
	public static void main(String[] args) {
		thisAndSuperKeyword t=new thisAndSuperKeyword();//////creating object of sub class
		
		t.m2();//////////////////////////////////////////////here m calling m2() by using ref variable
		
		//OUTPUT:- super m()
		//		   sub m1()

	}

}
