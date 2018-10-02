package com.coreJava.logicalInterviewQuestion;

public class countArrayValue {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		int count=0;
		
		for(int i=0;i<=arr.length-1;i++){
			count+=arr[i];
		}
			
		System.out.println(count);
	}

}
