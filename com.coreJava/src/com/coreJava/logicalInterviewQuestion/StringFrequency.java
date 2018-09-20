package com.coreJava.logicalInterviewQuestion;

public class StringFrequency {

	public static void main(String[] args) {
		String s="abjhfbsddh";
		int count;
		
		for(char c='a';c<='z';c++){
			count=0;
			
			for(int i=0;i<=s.length()-1;i++){
				char ch=s.charAt(i);
				
				if(ch==c){
					count++;
				}
			}
			if(count>0){
				System.out.println("the alphabet "+c+" repeat " +count+" times");
			}
		}

	}

}
