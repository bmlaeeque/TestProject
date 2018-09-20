package com.coreJava.innerclass;
/**
 * Q)what is Local Inner class ?
 * 		class inside method is called localInner class.
 * 		
 * 
 *
 */
public class localInnerClass {
	private int data = 30;// instance variable

	void display() {
		class Local {
			void msg() {//4
				System.out.println(data);//5
			}
		}
		Local l = new Local();//2
		l.msg();//3
	}

	public static void main(String args[]) {
		localInnerClass obj = new localInnerClass();
		obj.display();//1
	}
}
