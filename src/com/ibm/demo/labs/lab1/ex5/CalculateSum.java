package com.ibm.demo.labs.lab1.ex5;

public class CalculateSum {

	public int calcSum(int n) {
		int sum=0;
		for (int i=1;i<=n;i++) {
			if (i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		return sum;
//		System.out.println(sum);
	}
}
