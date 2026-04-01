package com.ibm.demo.day3.exception;


public class CheckedException {

	
	static void printNums() throws InterruptedException {
		for (int i = 0; i <=10; i++) {
			Thread.sleep(250);
			System.out.println(i);
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		try {
			CheckedException.printNums();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
		}
		
	

}
