package com.coreJava.ExceptionHandling;

class Ssuper extends Exception {
	public void m() {

	}
}

public class UnChekecdExceptionInOverriding extends Ssuper{
	public void m() {
		throw new NumberFormatException();//in this situation we don't need to handle exception if its Runtime exception
	}
	
	public static void main(String[] args) {
		
	}
}
