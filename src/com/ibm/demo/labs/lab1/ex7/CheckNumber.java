package com.ibm.demo.labs.lab1.ex7;

public class CheckNumber {

	public boolean isIncreasing(int n) {
		if (n<10) {
			return true;
		}
		int lastDigit =n%10;
		int nextDigit=(n/10)%10;
		if(lastDigit<nextDigit) {
			return false;
		}
		return isIncreasing(n/10);
	}
}