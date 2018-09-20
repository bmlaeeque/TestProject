package com.coreJava.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Student {
	int rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

class comp implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {

		return a.rollno - a.rollno;
	}
}

public class Test1WithoutLambda {

	public static void main(String[] args) {

		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(new Student(111, "bbbb", "london"));
		ar.add(new Student(333, "aaaa", "nyc"));
		ar.add(new Student(222, "cccc", "jaipur"));

		System.out.println("before sort........");
		for (Student s : ar) {
			System.out.println(s);
		}

		Collections.sort(ar, new comp());

		System.out.println("after sort........");
		for (Student s : ar) {
			System.out.println(s);
		}
	}

}
