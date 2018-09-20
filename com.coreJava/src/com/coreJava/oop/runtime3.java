package com.coreJava.oop;
class AA{
	/* void m(){/////////////////////////////successfully run
		System.out.println("super:m()");
	}*/
	/*protected void m(){////////////////////successfully run
		System.out.println("super:m()");
	}*/
	/*private void m(){//////////////////////successfully fun
		System.out.println("super:m()");
	}*/
	public void m(){
		System.out.println("super:m()");
	}
	
}
public class runtime3 extends AA {
	public void m(){
		System.out.println("sub:m()");
	}
	public static void main(String[] args) {
		AA a=new runtime3();
		a.m();
		
	}

}
