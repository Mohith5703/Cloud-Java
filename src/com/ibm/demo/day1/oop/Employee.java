package com.ibm.demo.day1.oop;

import com.ibm.demo.day1.fundas.*;

public class Employee {

	
	static int officeNum;
	
	int id;
	String name;
	double sal;
//	String email;
//	long[] phones;
//	Address address;
	
	void work(){
		System.out.println();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}