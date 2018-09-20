package com.coreJava.ThisAndSuperKeyword;
class AAA{
	
	 int a=100;
	
	
}
public class thisAndSuper extends AAA {
	
	int a=50;
	
	public void m(){
		System.out.println(this.a);///////O/P:-50 ///this can be used to refer current class instance variable.
		
		System.out.println(super.a);//////O/P:-100  ///super can be used to refer parent class instance variable.
	}
	

	public static void main(String[] args) {
		
		thisAndSuper t=new thisAndSuper();
		t.m();
		
		
	}

}
