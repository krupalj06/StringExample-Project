package com.krupa;

public class StringCompare {
	
	public static void main(String[] args) {
		
		String s1 = "krupa"; //Literals
		String s2 = "krupa";
		String s3 = new String("krupa"); //Creating using new keyword 
		
		if(s1.equals(s2)) { //Compares values 
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
		if(s1 == s3) {  //Compares memory 
			System.out.println("memory equal: true");
		}else {
			System.out.println("memory equal: false");
		}
		
	}

}
