package com.ibm.demo.day3.object;

public class ObjectClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1=new Employee(1,"abc",890.98);
		Employee emp2=new Employee(1,"abc",890.98);
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	}

}
