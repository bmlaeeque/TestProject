package com.coreJava.camprableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

class Sttudent implements Comparable<Sttudent> {
	int rollno;
	String name, address;

	// Constructor
	public Sttudent(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public int compareTo(Sttudent st) {

		if (rollno == st.rollno)
			return 0;
		else if (rollno > st.rollno)
			return 1;
		else
			return -1;
	}
}

public class comparable {
	/**
	 * Q)What is comparable ? its a interface present in java.lang.util package
	 * and it contain one method 
	 * 		
	 * 		(1)compareTO()
	 * 
	 * its meant for default natural sorting order
	 * 
	 * (internally TreeSet uses Default natural sorting order)
	 * 
	 * 
	 */
	
	public static void main(String[] args) {

		ArrayList<Sttudent> ar = new ArrayList<Sttudent>();
		ar.add(new Sttudent(111, "bbbb", "london"));
		ar.add(new Sttudent(333, "aaaa", "nyc"));
		ar.add(new Sttudent(222, "cccc", "jaipur"));

		
		Collections.sort(ar);

		System.out.println("after sort........");
		for (Sttudent s : ar) {
			System.out.println(s);
		}

	}

}
