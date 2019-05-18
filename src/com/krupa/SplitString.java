package com.krupa;

public class SplitString {
	public static void main(String[] args) {
		
		String filePath ="";
		String[] ref = filePath.split("/");
		for(int i=0; i < ref.length; i++) {
			System.out.println(ref[i]);
		}
		System.out.println("==========================");
		String fruitList = "apple,grapes,banana,pomogranite,cherry,mango";
		String[] fruits = fruitList.split(",");
		for(int i=0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		System.out.println("==========================");
		String str = "a/1a/2a0/3a/4a/5";
		String[] num = str.split("a/");
		for(int i=0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		//Assignment : explore split(regex, limit);
		
		
		String hello = "    hello   world    ";
		System.out.println("before trim:"+ hello);
		System.out.println("after trim:"+hello.trim()+":This");
		
		System.out.println(hello.contains("world"));
		
		
		String x = new String("x-men");
		
//		System.out.println("=="+ (x==y)); //false;
		String z = x.intern();
		String y = "x-men";
		System.out.println(z==y); 
		
	}
	

}
