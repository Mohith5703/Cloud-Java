package com.ibm.demo.day2.oop.abstraction;

public class AbstructDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HdfcBank bank1=new HdfcBank();
		bank1.doKyc();
		
		IciciBank bank2=new IciciBank();
		bank2.doKyc();
	}

}
