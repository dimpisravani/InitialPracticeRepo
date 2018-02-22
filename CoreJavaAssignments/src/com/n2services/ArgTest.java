package com.n2services;

public class ArgTest {
	public static void main(String args[]) {
		
		System.out.println("Testing the code");
		if (args.length > 0) {
			System.out.println(args[0]);
			// System.out.println(args1.length);
		} else {
			System.out.println("No args!!");
		}
	}

}
