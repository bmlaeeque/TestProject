package com.coreJava.collection;

import java.util.Iterator;

class product{
	private int pid;
	private String name;
	public product(int i, String string) {
		
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "product [pid=" + pid + ", name=" + name + "]";
	}
}
public class ArrayList {

	public static void main(String[] args) {
		// If your compiler settings are correct.
		java.util.ArrayList<product> s = new java.util.ArrayList<product>();
		
		s.add(new product(1,"aaa"));
		s.add(new product(2,"bbb"));
		s.add(new product(3,"ccc"));
		
		
		/*Iterator<product> it=s.iterator();
		
		if(it.hasNext()){
			 System.out.println(it.next());
		}*/
		
		System.out.println(s);
		
		
		
		
		

	}

}
