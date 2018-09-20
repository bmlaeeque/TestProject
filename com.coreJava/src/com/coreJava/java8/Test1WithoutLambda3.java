package com.coreJava.java8;

import java.util.Arrays;
import java.util.List;

public class Test1WithoutLambda3 {

	public static void main(String[] args){
		
		
		List<Developer> listDev =  Arrays.asList(new Developer("aaa", "java", 2),new Developer("bbb", ".net", 3),new Developer("ccc", "php", 1));

		listDev.sort((o1, o2) -> o1.getId() - o2.getId()); //here i m using lambda expression for sorting
		
		System.out.println("after sort........");
		
		listDev.forEach((l) -> System.out.println(l));  //here i am using forEach method
		
		
	}

}
