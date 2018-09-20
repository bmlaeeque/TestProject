package com.coreJava.MakingASingletonClass;

public class makingSingltonClass {
	/**
	 * 1)what is singleton class?
	 * 		its a class with only one object 
	 * 
	 * 3)how many singlton classesin java?
	 * 		may be more classes are singlton in java
	 * 		but i know one classes silgleton in java is java.lang.runtime
	 * 
	 * 2)how to make a class as Singleton?
	 * 		1)make a constructor private(so outsider cna't create our class object )
	 * 		2)create a one static factory method   getInstance(); (to get single object of class for outsider )
	 * 		3)make that factory method to synchronized (so at a time only one thread can access that method) 
	 * 		4)override cone() and throw cloneNotSupoortedException(); (so we can not create a copy of that object)
	 * 
	 * 		
	 */
	
		public static makingSingltonClass makingSingltonClass=null;
	
		public static synchronized makingSingltonClass getINstance(){
			if(makingSingltonClass !=null){
				return new  makingSingltonClass();
			}
			return null;
			//@Override
		// public void clone() throw new CloneNotSupportedException;
				
			
		
	}

	public static void main(String[] args) {
		
			
	}
	
	

}
