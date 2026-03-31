package com.ibm.demo.day2.oop;

public class Employee {

	int id;
	String name;
	double salary;
	
	public Employee() {
		System.out.println("default consturctor");
	}
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
		System.out.println("with 2 args consturctor");
		
	}
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("all args consturctor");
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
