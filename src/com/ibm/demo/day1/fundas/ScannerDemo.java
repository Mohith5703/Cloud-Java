package com.ibm.demo.day1.fundas;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("say hello");

		String user = "abc";

		System.out.println("hi" + user);
		

		Scanner sc = new Scanner(System.in);

		System.out.println("say hello");

		String userr = sc.next();

		System.out.println("hi " + userr);
		
		sc.close();
	}

}
