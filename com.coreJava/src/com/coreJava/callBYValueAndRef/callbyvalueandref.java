package com.coreJava.callBYValueAndRef;

public class callbyvalueandref {
	/**
	 * there no concept like call by refrence is java only concept call by value ,
	 * 			if we call method passing a value is known as call by value
	 * 
	 * in which calling method is not effected only called method will effected
	 * 
	 */
	int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 }  
	     
	 public static void main(String args[]){  
		 callbyvalueandref op=new callbyvalueandref();  
	  
	   System.out.println("before change "+op.data); // before change 50
	   
	   op.change(500);  
	   System.out.println("after change "+op.data); //after change 50 
	  
	 }  

}
