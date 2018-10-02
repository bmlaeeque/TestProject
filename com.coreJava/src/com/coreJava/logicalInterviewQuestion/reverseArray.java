package com.coreJava.logicalInterviewQuestion;

public class reverseArray {
	
	
	public static void main(String[] args) {
		int[] input={1,2,3,4,5,5,6};
		
		int i=0;
		int j=input.length-1;
		int temp;
		
		
		while(i<j){
			temp=input[i];
			input[i]=input[j];
			input[j]=temp;
			i++;
			j--;
			
		}
		for(int a:input){
			System.out.println(a);
		}
	}	
}
