package com.coreJava.multithreading;

public class multithreadingExample1 {
	/**
	 * Q)What is process?
	 * 		process is self execution program
	 * Q)what is Thread?
	 * 		thread is single task execution of process(program)
	 * 
	 * Q)life cycle of thread?
	 * 		new :-
	 * 
	 * 		Runnable:-
	 * 		
	 * 		Running:-
	 * 		
	 * 		block:-
	 * 		
	 * 		terminate:-	
	 * 
	 * Q)What is thread shedular ?
	 * 			thread shedular is a part of JVM that decide which thread will give high priority.
	 * 
	 * Q)what is preemptive scheduling?
	 * 			in preemptive scheduling highest priority thread will give first chance to complete our execution
	 * Q)what is time slicing?
	 * 			
	 * 
	 * Q)what is sleep() ?
	 * 		sleep() used to sleep a thread for particular amount of time
	 * 
	 * Q)what happend if we call directly to run() ?
	 * 		yes we can call directly run() but here no new thread will create .
	 * 
	 * Q)what is join()?
	 * 			if we call join() then it will enter remaining threads into waiting state until current thread completes its execution. 
	 * 		
	 * Q)what is Daemon Thread?
	 * 		its a running into backgournd  that provide support to our program.
	 * Q)What is Thread Pool?
	 * 		thread pool represent a group of worker thread which are waiting for job 	
	 * 			we can use it many times
	 * Q)what is shutdwon Huk?
	 * 		it the state of object when JVM shutdwon ab-normally.
	 * Q)what is Yield()?
	 * 			here it will pause to currently executing thread and give chance to othere thread to execute
	 * 
	 * Q)what is wait()?
	 * 		it tell to current executing thread release lock and wait until other thread call notify() or notifyAll().
	 * Q) what is notify()?
	 * 			it inform to waiting thread those are waiting for access particular object.
	 * 
	 * Q)what happened if i m not calling wait(),notify(),notifyAll() in synchronized block?
 * 
 * 			if we don't call wait() , notify() ,notifyAll() in synchronized block then it will throw 
 * 			illegalMonitorStateException
	 * 
	 * Q)Why wait(), notify() and notifyAll() methods are defined in Object class not Thread class?
It 					is because they are related to lock and object has a lock.
	 */
	
	
	public static void main(String[] args) {
		

	}

}
