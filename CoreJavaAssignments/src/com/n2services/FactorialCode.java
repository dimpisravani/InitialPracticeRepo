package com.n2services;

import java.util.Scanner;

/**
 * @author srava
 * 
 */
public class FactorialCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userinput;
		long i = 0;
		long fact = 1;

		Scanner reader = new Scanner(System.in);

		System.out.println("enter the number ");

		userinput = reader.nextInt();

		for (i = 1; i <= userinput; i++)

			fact = fact * i;

		System.out.println(fact);

	}

}
