package com.krupa;

public class StringMethods {
	public static void main(String[] args) {
		
		String str1 = "Hello World";
		String str2 = "ABC";
		String str3 = "";
		
		System.out.println("Compare value"+ str1.equals(str2));
		System.out.println(" Compare value ignore case"+str1.equalsIgnoreCase(str2));
		System.out.println("length: "+str1.length());
		System.out.println(str1.charAt(2));
		System.out.println(str1.indexOf('W'));
		System.out.println(str3.isEmpty());
		System.out.println(str1.lastIndexOf('e'));
		System.out.println("Starts with:"+ str1.startsWith("abc"));
		System.out.println("Ends with: "+ str1.endsWith("World"));
		System.out.println("SubString of "+str1.substring(6, 11));
		System.out.println(str1.replace("World", "krupa"));
		System.out.println(str1.toUpperCase());
		System.out.println(str2.toLowerCase());
		
		
	}

}
