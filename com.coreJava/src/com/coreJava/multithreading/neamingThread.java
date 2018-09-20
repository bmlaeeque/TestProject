package com.coreJava.multithreading;
class a extends Thread{
	public void run(){
		System.out.println("a");
	}
}
public class neamingThread {

	public static void main(String[] args) {
		Thread t=new Thread();
		t.start();
		System.out.println(t.currentThread().getName());
		
		t.setName("a");
		
		System.out.println(t.currentThread().getName());

	}

}
