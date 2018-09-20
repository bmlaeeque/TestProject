package com.coreJava.innerclass;
/**
 * Q)what is member inner class ?
 * 		class inside class is called member inner class.
 * 
 * 
 *
 */
public class memberInnerClass {
		
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		memberInnerClass obj = new memberInnerClass();
		memberInnerClass.Inner in = obj.new Inner();
		in.msg();
	}
}
