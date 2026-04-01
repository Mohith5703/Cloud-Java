package com.ibm.demo.day3.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class IoNioDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		List<String> lines=null;
		try {
			lines=Files.readAllLines(Path.of("Data.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(lines!=null) {
			for(String line : lines) {
			System.out.println(line);
			}
			try {
				Files.write(Path.of("Data2.txt"),lines);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end");
	}
	

}
