package com.coreJava.logicalInterviewQuestion;

import java.util.Scanner;

public class removeVowelFromString {

	public static void main(String[] args) {
		
		Scanner sc=new  Scanner(System.in);
		System.out.println("Enter String");
		String name=sc.next();
		
		String output=name.replaceAll("[aeiouAEIOU]", "");
		
		System.out.println(output);
		
		}

}
