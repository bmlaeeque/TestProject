package com.coreJava.logicalInterviewQuestion;

import java.util.Scanner;

public class stringAbrivation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		
		String name=sc.nextLine();
		
		String FName=name.substring(0,name.indexOf(" "));
		System.out.println(FName);
		
		String MName=name.substring(name.indexOf(" ")+1, name.lastIndexOf(" "));
		System.out.println(MName);
		
		String LName=name.substring(name.lastIndexOf(" ")+1);
		System.out.println(LName);
		
		String FN=String.valueOf(FName.charAt(0)).toUpperCase();
		System.out.println(FN);
		
		String MN=String.valueOf(MName.charAt(0)).toUpperCase();
		System.out.println(MN);
		
		String LN=String.valueOf(LName.charAt(0)).toLowerCase();
		System.out.println(LN);
		
		String LName1="";
		for(int i=0;i<FName.length();i++){
			if(i==0){
				LName1+=FName.charAt(i);
				LName1=LName1.toUpperCase();
			}else if(i!=0){
				LName1+=FName.charAt(i);
				LName1=LName1.toLowerCase();
			}
		}
		 System.out.println(LName1);
		
		
		
	}

}
