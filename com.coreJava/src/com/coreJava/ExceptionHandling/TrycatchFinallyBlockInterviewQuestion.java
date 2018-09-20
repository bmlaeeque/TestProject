package com.coreJava.ExceptionHandling;

/*public class TrycatchFinallyBlockInterviewQuestion {
	public static void main(String[] args) {
	
		System.out.println(m());////////////////////////caaling m() from main()
	}
	public static int m() {
		try{
			return 5;
		}catch(Exception e){
			return 10;
		}finally {
			return 50;//////////////here finally block is execute and reyrn 50
		}
		
	}

}*/

class TrycatchFinallyBlockInterviewQuestion2{
	public static int m() {////////////////////////
		try{
			return 5;/////////////////here try block is execute and return 5
		}catch(Exception e){
			return 10;
		}finally {
			return 50;////////////////and also finally block we will execute and return 50
		}
		
	}
}
