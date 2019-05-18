package com.krupa;

public class StringConcatination {
	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = " world";

		System.out.println("String concatination using +: " + s1 + s2);
		System.out.println("String concatination using .concat: " + s1.concat(s2));

		String a = s1+10 +20 + s2;
		String b = s1+ s2 + 10 +20 ;
		String c = 10 + 20 + s1+ s2;
		
		System.out.println("String concatination with numbers"+ a); //hello1020 world 
		System.out.println("String concatination with numbers"+ b); // hello world1020
		System.out.println("String concatination with numbers"+ c+10+20); //30hello world
		
		
		System.out.println(s1.concat("10")); // hello krupa
		System.out.println(s1); //hello
		s1 = s1.concat("krupa");
		System.out.println(s1); // hello krupa
		
	}

}
