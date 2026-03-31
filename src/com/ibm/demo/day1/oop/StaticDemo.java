package com.ibm.demo.day1.oop;

public class StaticDemo {

	static int num1=10;
	int num2=9;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static field=access as clsname.fieldname
		System.out.println(StaticDemo.num1);
		
//		instance field=access as objname.fieldname
		StaticDemo obj=new StaticDemo();
		System.out.println(obj.num2);
	}

}
