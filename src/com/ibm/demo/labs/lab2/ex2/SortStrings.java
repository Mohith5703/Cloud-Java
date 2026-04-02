package com.ibm.demo.labs.lab2.ex2;

import java.util.Arrays;

public class SortStrings {

	public static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		if(arr.length%2==0) {
			for (int i = 0; i < arr.length/2; i++) {
				arr[i]=arr[i].toUpperCase();
			}
		}else{
			for (int i = 0; i < arr.length/2; i++) {
				arr[i]=arr[i].toUpperCase();
			}
		}
		
//		System.out.println(arr);
		return arr;
		}
	
	}


