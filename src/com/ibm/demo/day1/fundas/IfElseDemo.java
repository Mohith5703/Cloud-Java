package com.ibm.demo.day1.fundas;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=900;

		if (0<=marks & marks<=100) {
			if (marks>90) 
				System.out.println("A");
			else if(marks>80)
				System.out.println("B");
			else
				System.out.println("fail");
		}
	}

}
