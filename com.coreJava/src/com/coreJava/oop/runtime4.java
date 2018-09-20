package com.coreJava.oop;
class B{
	public void m(Number n){
		System.out.println("super");
	}
}
public class runtime4 extends B {
	public void m(int n){
		System.out.println("sub");
	}
	public static void main(String[] args) {
		B b=new runtime4();
		b.m(10); ///////////////////////////////O/P::super 
	}

}
