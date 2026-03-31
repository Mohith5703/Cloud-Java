package com.ibm.demo.day2.access;

public class ParameterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--main method--");
		
//		calling method
		
		Methods.withargsNoReturn(1, 2);
//		Methods.withargsNoReturn();//Comp error
//		Methods.withargs(1,2,3);//Comp error
		Methods.noargs();
		
		System.out.println(Methods.withReturnWithArgs(2, 3));
		
		System.out.println(Methods.withReturnNoArgs());

	}
class Methods{
	static void withargsNoReturn(int i,int j) {
		System.out.println(i+j);
	}
	
	static void noargs() {
		System.out.println("no args");
	}
	
	static int withReturnWithArgs(int i,int j) {
		return i+j;
	}
	
	static int withReturnNoArgs() {
		return 100;
	}
	
	
	
}
}
