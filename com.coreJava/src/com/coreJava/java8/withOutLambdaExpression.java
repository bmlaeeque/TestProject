package com.coreJava.java8;

interface Lmbda{
	public int foo(int a,int b);
}

class lmbdaExpression implements Lmbda{

	@Override
	public int foo(int a,int b) {
		
		return a+b;
	}
	
}
public class withOutLambdaExpression {

	public static void main(String[] args) {
		Lmbda l=new lmbdaExpression();
		int i=l.foo(1,2);
		System.out.println(i);
		

	}

}
