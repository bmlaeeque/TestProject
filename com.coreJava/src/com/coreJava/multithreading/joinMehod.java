package com.coreJava.multithreading;
	/**
	 * Q)what is join()?
	 * 			if we call join() then it will enter remaining threads into waiting state until current thread completes its execution. 
	 * 	
	 * @author icon
	 *
	 */
class joinMehod extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		joinMehod t1 = new joinMehod();
		joinMehod t2 = new joinMehod();
		joinMehod t3 = new joinMehod();
		t1.start();
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}