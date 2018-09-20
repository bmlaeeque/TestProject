package com.coreJava.ThisAndSuperKeyword;
class suuupers{
	int a=10;
	suuupers(){
		
	}
}
public class CanWeUseSuperKeywordFromStaticMethod {
	
	int a=50;
	public static void m(){
		//super();//////////////////////////////////////////we can't call super class constructor from static m() of sub class C.E
		
		//this();/////////////////////////////////////even we can't call same class constructor from static m()   C.E
		
		//System.out.println(this.a;);  C.E
		//System.out.println(super.a;); C.E
	}
	public static void main(String[] args) {
		

	}

}
