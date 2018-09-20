package com.coreJava.ThisAndSuperKeyword;

class Super{
	Super(){
		System.out.println("super class constructor is called");
	}
	
}
public class SuperAndThisKeywordCallingConstructor extends Super {
	SuperAndThisKeywordCallingConstructor(){
		super();///////////////////////////////////////////////calling to super class constructor by using super keyword
															///and super keyword  must be a first statement O.w we will get Comiple time error
		
		System.out.println("sub class Construtor is called");
	}
	public static void main(String[] args) {
		SuperAndThisKeywordCallingConstructor ss=new SuperAndThisKeywordCallingConstructor();
		
		 //OutPut:- super class constructor is called
		//			sub class constructor is called

	}

}
