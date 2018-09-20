package com.coreJava.java8;
/**
 * 
 * any method in interface is by defoult public abstract 
 * 
 * Q)why defoult method came in to the market?
 * 			any method in interface is by defoult public abstract so definatly we have to implement that method in sub-classes
 * 			
 * 			supose after complition of project if we want to add some fucntionality so that we have to definatly add that implimentation in
 * 			sub-classes
 * 			so its very complex so defoult method in interface come into market here we no need to implement in sub-classes
 * 
 * Q)static method:-
 * 			Since static methods don’t belong to a particular object, they are not part of the API of
 * 			 the classes implementing the interface, 
 * 			and they have to be called by using the interface name preceding the method name
 * 			like:-
 * 					defoultAndStaticMethodInInterface.m2();
 * 
 * 
 * 
 * Q)
 *
 */
public interface defoultAndStaticMethodInInterface {
	
	public void m1();
	
	default void  m(){
		
	}
	
	public static void m2(){
		
	}
		
}
