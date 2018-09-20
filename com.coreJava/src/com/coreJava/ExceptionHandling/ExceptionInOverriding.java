package com.coreJava.ExceptionHandling;

class Super extends Exception {
	public  void m() throws ClassNotFoundException {

	}
}

public class ExceptionInOverriding extends Super {

	/*public void m() throws ClassNotFoundException {/// if Exception is checked exception then we need to definitely handle it from sub 
		throw new ClassNotFoundException();			//// class method also in super class method see as above
	}*/

	public static void main(String[] args) {

	}

}
