package com.ibm.demo.day2.oop.abstraction;

abstract class Rbi{
	abstract void doKyc();
}

class HdfcBank extends Rbi{
	@Override
	void doKyc() {
		System.out.println("Kyc with aaddhar");
	}
}

class IciciBank extends Rbi{
	@Override
	void doKyc() {
		System.out.println("Kyc with PAN");
	}
}


public class Banking {

}
