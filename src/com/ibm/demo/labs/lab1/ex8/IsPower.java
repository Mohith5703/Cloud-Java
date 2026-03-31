package com.ibm.demo.labs.lab1.ex8;

public class IsPower {

	public static boolean isPow(int n) {
		if(n<=0) {
			return false;
		}
		while (n != 1) {
            if (n % 2 != 0) { // If remainder is not zero, then it's not a power of two
                return false;
            }
            n = n / 2;
        }
        return true;
	}
}
