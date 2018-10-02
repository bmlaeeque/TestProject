package com.coreJava.logicalInterviewQuestion;

import java.util.Arrays;

import com.coreJava.overloadingMainMethod.mainMethod;

public class removeDuplicateFromArray {
	
	public static void duplicate(int[] input){
		int count=0;
		for(int i=0;i<input.length-1;i++){
			for(int j=i+1;j<input.length;j++){
				
				if(input[i]!=input[j]){
					input[i]=input[count];
					count++;
				}
				break;
			}
		}
		for(int a:input){
			System.out.println(a);
		}
		
	}
	
	public static void main(String[] args) {
		duplicate(new int[]{1,2,3,4,4,5});
	}

}
