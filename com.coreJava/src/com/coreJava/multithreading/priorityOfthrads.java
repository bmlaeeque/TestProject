package com.coreJava.multithreading;
class Q extends Thread{
	public void run(){
		
	}
}
public class priorityOfthrads {

	public static void main(String[] args) {
		Thread t=new Thread();
		
		System.out.println(t.currentThread().getPriority());
		
		t.setPriority(8);
		System.out.println(t.currentThread().getPriority());

	}

}
