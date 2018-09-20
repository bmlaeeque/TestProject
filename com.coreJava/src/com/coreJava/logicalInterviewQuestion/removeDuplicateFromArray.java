package com.coreJava.logicalInterviewQuestion;

import java.util.Arrays;

public class removeDuplicateFromArray {
	public static void m1(int[] input){
		int count=0;
		for(int i=0;i<input.length;i++){
			for(int j=0;j<input.length;j++){
				
				if(i==j){
					input[count]=input[i];
					count++;
				}
			}
			System.out.println(Arrays.toString(input));
		}
	}
	public static void main(String[] args) {
		System.out.println(new int[] {1,2,3,4,5,4,6,5});

	}

}
