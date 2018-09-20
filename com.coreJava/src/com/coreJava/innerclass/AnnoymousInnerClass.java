package com.coreJava.innerclass;
/**
 * Q)what is Annonymous Inner class?
 * 		a class which doesn't contain any body 
 * 					
 * Q)purpose of this class :-
 * 		mainly this class is used to access functional interface method.
 * 					
 * 
 *
 */

interface  Person {
	abstract void eat();
}

public class AnnoymousInnerClass {

	public static void main(String args[]) {
		
		Person p = new Person() {
			public void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}
}


