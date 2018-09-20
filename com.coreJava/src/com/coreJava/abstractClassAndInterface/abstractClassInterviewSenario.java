package com.coreJava.abstractClassAndInterface;

public abstract class abstractClassInterviewSenario {
		int trainNumber;
		
		public  void economyClass(){
			int cost=0;
		}
		public  void acThreeTayerClass(){
			int cost=0;
		}
}
class economyClass extends abstractClassInterviewSenario{

	@Override
	public void economyClass() {
		int cost=10;
		
	}

	@Override
	public void acThreeTayerClass() {
		int cost=10;
		
	}
	
}