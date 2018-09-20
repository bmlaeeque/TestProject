package com.coreJava.java8;

interface Lambdae {
	public int foo(int a, int b);
}

public class lambdaExpression {

	public static void main(String[] args) {

		Lambdae fo = (a, b) -> 10 + 20;
		//int i=fo;
		System.out.println(fo);

	}

}
