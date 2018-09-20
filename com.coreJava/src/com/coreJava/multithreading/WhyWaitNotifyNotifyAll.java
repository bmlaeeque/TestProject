package com.coreJava.multithreading;

/**
 * Q)Why wait(), notify() and notifyAll() methods are defined in Object class
 * not Thread class?
 * 
 *  It is because they are related to lock and object has a
 * lock.
 * 
 * Q)what happened if i m not calling wait(),notify(),notifyAll() in synchronized block?
 * 
 * 			if we don't call wait() , notify() ,notifyAll() in synchronized block then it will throw 
 * 			illegalMonitorStateException
 *Q)what happened if we start current twice ?
 *		if we start thread twice then it will throw illegalStateException
 *
 */
class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}

class WhyWaitNotifyNotifyAll {
	public static void main(String args[]) {
		final Customer c = new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();

	}
}
