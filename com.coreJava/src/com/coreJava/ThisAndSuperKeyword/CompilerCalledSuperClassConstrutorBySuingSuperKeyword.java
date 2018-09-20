package com.coreJava.ThisAndSuperKeyword;
class Suuper{
	Suuper(){
		System.out.println("Super class Constructor is called");
	}
}
public class CompilerCalledSuperClassConstrutorBySuingSuperKeyword extends Suuper{
	CompilerCalledSuperClassConstrutorBySuingSuperKeyword(){
		//super();
		
		/**
		 * here internally compiler is used super() and called Super class constructor as above
		 */
		
		System.out.println("sub clas construtor is called ");
	}
	
	public static void main(String[] args) {
		CompilerCalledSuperClassConstrutorBySuingSuperKeyword c=new CompilerCalledSuperClassConstrutorBySuingSuperKeyword();
		
		

	}

}
