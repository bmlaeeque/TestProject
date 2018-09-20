package com.coreJava.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1WithoutLambda2 {

	public static void main(String[] args){
		
		
		List<Developer> listDev =  Arrays.asList(new Developer("aaa", "java", 2),new Developer("bbb", ".net", 3),new Developer("ccc", "php", 1));
		
		
		Collections.sort(listDev, new Comparator<Developer>(){   //Collections.sort(all the implementations are in inside in sort());
			@Override
			public int compare(Developer o1, Developer o2) {
				
				return o1.getId() - o2.getId();  
			}
			
		});
		
		
		System.out.println("after sort........");
		
		for(Developer d:listDev){
			System.out.println(d);
		}
		
		
	}

}
