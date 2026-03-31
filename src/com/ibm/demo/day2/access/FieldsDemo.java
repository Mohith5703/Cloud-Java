package com.ibm.demo.day2.access;

public class FieldsDemo {
	
	static int staticField=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int staticField=20;
		System.out.println(staticField);//checks inside method 1st then class
		System.out.println(FieldsDemo.staticField);
	}

}
