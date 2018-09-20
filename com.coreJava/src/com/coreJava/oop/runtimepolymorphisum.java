package com.coreJava.oop;
/**
 * 0)what is method hiding?
 * 		
 * 1)what is Runtime Pollymorphisum?(object is bind at runtime)
 * 		Refrying a overridden method to super class reference variable is also known as runtime polymorphisum.example(method overriding)
 * 2)compiletime ploymorphisum?(object is bing at runtime)
 * 
 * 3)what is Autoboxing?
 * 		converting primitive types into its equivalent wrapper class
 * 4)what is auto-unboxing?
 * 		converting wrapper class into its equivalent primitive type
 * 
 *
 */
interface mobile{
	public void sim();
}

class vodafone implements mobile{

	@Override
	public void sim() {
		System.out.println("vodafone sim is inserted");
	}
	
}
class idea implements mobile{

	@Override
	public void sim() {
		System.out.println("idea sim is inseted");
	}
	
}
class jio implements mobile{

	@Override
	public void sim() {
		System.out.println("jio sim is inserted");
	}
	
}
public class runtimepolymorphisum {

	public static void main(String[] args) {
		mobile m=new vodafone();//upcasting //runtime polymorphisum
		m.sim();
	}

}
