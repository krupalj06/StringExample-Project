package com.krupa;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		System.out.println(str);
		System.out.println(str.append("Good Day"));
		System.out.println("Length of str: "+str.length());
		System.out.println("Capacity of str: "+str.capacity());
		
		System.out.println(str.append(" to All of you"));
		
		System.out.println("Length of str: "+str.length());
		System.out.println("Capacity of str: "+str.capacity());
		
		
		str.append(" How are you all?"); //Appends at the End of string
		System.out.println(str);
		
		System.out.println("Length of str: "+str.length());
		System.out.println("Capacity of str: "+str.capacity());
		
		//Good Day to All of you How are you all?
		str.insert(9, ", Good morning");
		str.insert(23, " ,");
		System.out.println(str);
//		System.out.println(str.insert(41, "!!!"));
		
		System.out.println(str.append('x')); //Appends char at end of string
		
		System.out.println(str.reverse());
		System.out.println(str.reverse());
		System.out.println(str.delete(0,10));
		System.out.println(str.deleteCharAt(22));
		
		char[] a = {'H','E','L','L','O'};
		System.out.println(str.append(a));
		
		str.replace(0, 13, "Good Afternoon");
		System.out.println(str);
		
	}

}
