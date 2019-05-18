package com.krupa;

public class Comparisiontypes {
	public static void main(String[] args) {
		 
		String s1 = "Anand";
		String s2 = "Anand";
		String s3 = new String("Anand");
		String s4 = "Saraswati";
		String s5 = "SARASWATI";
		System.out.println("comparision with equals: "+s1.equals(s2)); //deep comparision
		System.out.println("comparision with ==: "+(s1==s2)); // true  //Shallow comparision 
		
		System.out.println("comparision with equals: "+s1.equals(s3));
		System.out.println("comparision with ==: "+(s1==s3)); //false
		
		System.out.println("comparing with compareto: "+s1.compareTo(s2));// 0 when true
		System.out.println("comparing with compareto: "+s1.compareTo(s4)); // non 0 when false
		System.out.println("comparing with compareto: "+s4.compareTo(s5)); // positive value
	}
}
