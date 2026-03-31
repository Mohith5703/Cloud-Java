package com.ibm.demo.day1.oop.method;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		//calling methods from other class
		
		System.out.println(Calc.pi());
		
		Calc obj=new Calc();
		System.out.println(obj.subtract(a,b));
		
		System.out.println(Calc.addNums(a, b));

		Calc.addPrintNums(a, b);
		
	}

}
