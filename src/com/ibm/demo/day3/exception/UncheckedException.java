package com.ibm.demo.day3.exception;

import java.util.Scanner;

public class UncheckedException {

	static void divide() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an int");
		int num1 = sc.nextInt();
		System.out.println("Enter another int");
		int num2 = sc.nextInt();
		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("Do not divide by 0, you fool!\ntry again");
			UncheckedException.divide();
		}
		finally {
			sc.close();
		}
	}
	public static void main(String[] args) {
		System.out.println("Start");
		UncheckedException.divide();
		System.out.println("End");

	}



//package com.ibm.demo.day3.exception;
//
//import java.util.Scanner;
//
//// unchecked exception ArithemticException handled 
//
//public class UncheckedExceptionDemo {
//
//	public static void main(String[] args) {
////		ArithmeticException, 
////		ArrayIndexOutOfBoundsException, 
////		StringIndexOutOfBoundsException, 
////		InputMismatchException,
////		NumberFormatException,
//		
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter an int");
//		int num1 = sc.nextInt();
//		System.out.println("Enter another int");
//		int num2 = sc.nextInt();
//		try {
//			System.out.println(num1 / num2);
//		} catch (ArithmeticException e) {
//			System.out.println("Do not divide by 0, you fool!");
//		}
//		finally {
//			sc.close();
//		}
//	}
//
//}


}
