package com.ibm.demo.day2.oop.abstraction;

public class InterfaceDemo {
	
	// interfaces allow multiple inheritance in Java 
	// interface can contain one or more abstract methods 
	// can also contain static methods 
	// can also contain default methods (like instance methods)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoClass obj =new DemoClass();
		obj.absMethod();
		
		DemoInterface.staticMethod();
		
		obj.defaultMethod();
	}

}
