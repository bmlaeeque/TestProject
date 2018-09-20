package com.coreJava.camprableAndComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Q)what is Comparator? 
 * 		its a interface present in java.util package it contain
 * 		two method 
 * 		(1)compare() 
 * 		(2)equals() 
 * 		
 * 		its meant for cutsamized sorting order
 * 
 */
class Studentt {
	int rollno;
	String name, address;

	// Constructor
	public Studentt(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

class comp implements Comparator<Studentt> {

	@Override
	public int compare(Studentt a, Studentt b) {

		return a.rollno - a.rollno;
	}

}

public class comparator {

	public static void main(String[] args) {

		ArrayList<Studentt> ar = new ArrayList<Studentt>();
		ar.add(new Studentt(111, "bbbb", "london"));
		ar.add(new Studentt(333, "aaaa", "nyc"));
		ar.add(new Studentt(222, "cccc", "jaipur"));

		System.out.println("before sort........");
		for (Studentt s : ar) {
			System.out.println(s);
		}

		Collections.sort(ar, new comp());

		System.out.println("after sort........");
		for (Studentt s : ar) {
			System.out.println(s);
		}

	}

}
