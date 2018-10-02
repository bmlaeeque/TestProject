package com.coreJava.logicalInterviewQuestion;

import java.util.Scanner;

public class identifyVowels {///////////

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Charecter");
		char c = sc.next().charAt(0); /////////// -------------->imp

		if (c == 'a' || c == 'A' || c == 'E' || c == 'e' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'U'
				|| c == 'u') {
			System.out.println(c + " this is vowel");
		} else {
			System.out.println(c + " this is not wovel");
		}

	}

}
