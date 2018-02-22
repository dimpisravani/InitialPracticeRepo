package com.n2services;

import java.util.*;

// reverse a number using while and do-while statements

public class ReverseNumber {

	public static void main(String args[]) {

		int number;
		int revnumber = 0;

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number");

		number = reader.nextInt();

		do {
			revnumber = revnumber * 10;

			revnumber = revnumber + (number % 10);
			number = number / 10;
		}
	while (number != 0);
		
			System.out.println(revnumber);

		
	}
}