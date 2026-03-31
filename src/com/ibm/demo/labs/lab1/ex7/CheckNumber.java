package com.ibm.demo.labs.lab1.ex7;

public class CheckNumber {

	public boolean checkNum(int n) {
		String temp=String.valueOf(n);
		for (int i=0;i<temp.length()-1;i++) {
			int n1=Integer.parseInt(temp);
			if(Integer.parseInt(temp[i])>Integer.parseInt(temp[i+1])) {
				continue;
			}else {
				return false;
			}
		}return true;
	}
}
