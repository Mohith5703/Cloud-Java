package com.ibm.demo.labs.lab1.ex6;

public class CalculateDiff {

	public int calcDiff(int n) {
		int sq=0;
		int sumSq=0;
		for (int i=1;i<=n;i++) {
			sq+=(i*i);
			sumSq+=i;
		}
		return sq-(sumSq*sumSq);
	}
}
