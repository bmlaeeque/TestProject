package com.coreJava.multithreading;
class Main implements Runnable{

	@Override
	public void run() {
		System.out.println("m");
		
	}
	
}
public class canWeCallTwiceStartMethod {

	public static void main(String[] args) {
		Main m=new Main();
		
		Thread t=new Thread(m);
		t.start();
		//t.start(); //if we call start() twice then it will thorw illgalThreadStateException
	}

}
