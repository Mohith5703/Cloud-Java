package com.ibm.demo.day1.oop;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
//		int num = 10;
		

		Employee emp1 = new Employee();
		emp1.id=1;
		emp1.name="monik";
		emp1.sal=90000;
//		System.out.println(emp1.id+""+emp1.name+""+emp1.sal);
		System.out.println(emp1.toString());
		emp1.work();
		
		Employee emp2 = new Employee();
		emp2.id=2;
		emp2.name="monika";
		emp2.sal=9000;
//		System.out.println(emp2.id+""+emp2.name+""+emp2.sal);
		System.out.println(emp2.toString());
		emp2.work();
	}

}
