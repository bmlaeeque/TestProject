package com.coreJava.ExceptionHandling;

public class TryCatchFinallyBlockExecution {

	public static void main(String[] args) {
		try{
			System.out.println("try");//////////////////it which we contain generally riskey code(means a code may throw Exception)
		}
		catch(Exception e){
			System.out.println("catch");/////////////////here we are handle that Exception
		}
		finally {
			System.out.println("finaly");////////////////this block is always execute if Exception is raised or not
		}
	}

}
