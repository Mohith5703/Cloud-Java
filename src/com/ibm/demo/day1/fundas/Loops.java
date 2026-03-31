package com.ibm.demo.day1.fundas;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for = fixed no of iterations
		
		//otherswise
		//while=min 0 iters
		//do while=min 1 iters
		
		//for each=to traverse through array and collections
		
		String[] frnd= {"a","b","c"};
		System.out.println("my frnds:-");
		for(int i=0;i<frnd.length;i++)
			System.out.println(frnd[i]);
		
		System.out.println("my frnds:-");
		for(String f : frnd)
			System.out.println(f);
	}
	

}
