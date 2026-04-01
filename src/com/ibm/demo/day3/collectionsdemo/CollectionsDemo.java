package com.ibm.demo.day3.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		
//		List myfrnds = new ArrayList();
//		ArrayList myfrnds = new ArrayList();
		List<String> myfrnds = new ArrayList<>();
		
		System.out.println("Size:"+myfrnds.size());
		System.out.println(myfrnds);
		myfrnds.add("sonu");
		myfrnds.add("monu");
		System.out.println("Size:"+myfrnds.size());
		System.out.println(myfrnds);
		myfrnds.remove(0);
		System.out.println("Size:"+myfrnds.size());
		System.out.println(myfrnds);
		myfrnds.add("tonu");
//		myfrnds.add(12);
//		myfrnds.add(12.2);
//		myfrnds.add(false);
		System.out.println("Size:"+myfrnds.size());
		System.out.println(myfrnds);
		
		
	}

}
