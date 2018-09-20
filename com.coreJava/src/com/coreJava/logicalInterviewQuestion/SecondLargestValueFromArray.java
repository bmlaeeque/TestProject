package com.coreJava.logicalInterviewQuestion;

public class SecondLargestValueFromArray {

	public static int m1(int[] input) {
		int first = 0, second = 0;

		if (input[0] > input[1]) {
			first = input[0];
			second = input[1];
		} else if (input[0] < input[1]) {
			first = input[1];
			second = input[0];
		}
		for (int i = 2; i < input.length; i++) {
			if (first > input[i]) {
				first = input[i];
				second = first;
			} else if (first < input[i]) {
				second = first;
			}

		}
		return second;

	}

	public static void main(String[] args) {
		System.out.println(new int[] { 1, 0, 4, 0, 4, 5, 6 });

	}

}
