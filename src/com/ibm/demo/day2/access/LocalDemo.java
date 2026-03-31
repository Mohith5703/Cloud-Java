package com.ibm.demo.day2.access;

public class LocalDemo {

	static int staticField = 10;
	int instanceField = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDemo.staticMethod();
		LocalDemo obj = new LocalDemo();
		obj.instanceMethod();
		System.out.println("main one");
		System.out.println(LocalDemo.staticField);
		System.out.println(obj.instanceField);
	}

	static void staticMethod() {
		System.out.println("this is from a static method");
		System.out.println(staticField);
		LocalDemo obj = new LocalDemo();
		System.out.println(obj.instanceField);
	}

	void instanceMethod() {
		System.out.println("this is from an instance method");
		System.out.println(staticField);
		System.out.println(instanceField);
	}
	

}
