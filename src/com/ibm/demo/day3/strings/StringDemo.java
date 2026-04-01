package com.ibm.demo.day3.strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("--string demo---");
		
		String str="Abcdc";
		
		String str1="abcd";
		
		String str2="       ";
		
		System.out.println(str);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(3));
		System.out.println(str.contains("c"));
		char[] strArr=str.toCharArray();
		for (char ch:strArr) {
			System.out.println(ch);
		}
		
		System.out.println(str.compareTo(str1));//give ascii value -ve if lower - upper.+ve if upper - lower,if equals then 0
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.endsWith("e"));
		System.out.println(str.startsWith("a"));
		System.out.println(str.contentEquals(str1));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));//irrespective upper or lower str must be same
		System.out.println(str1.codePointAt(0));//acsii values of particulr index
		System.out.println(str.repeat(2));//repeats str for given times
		System.out.println(str.indexOf("A"));//gives indexof a char
		System.out.println(str2.isBlank());//ckecks empty or not
		System.out.println(str2.isEmpty());//if length 0 true else false here whitespace also includes
		System.out.println(str.lastIndexOf("c"));//gives last index of particular string
	}

}
