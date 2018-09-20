package com.coreJava.logicalInterviewQuestion;

import java.util.Arrays;

public class SeprateZerosFromArrays {
	public static void m1(int[] input){
		int count=0;
		
		for(int i=0;i<=input.length;i++){
			
			if(input[i]!=0){
				input[count]=input[i];
				count++;
			}
		}
		while(count<input.length){
			input[count]=0;
			count++;
		}
		
		System.out.println(Arrays.toString(input));
	}
	
	public static void main(String[] args) {
		System.out.println(new int[]{1,0,4,0,4,5,6}); 

	}

}
