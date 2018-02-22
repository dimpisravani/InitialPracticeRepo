package com.n2services;

import java.util.Scanner;

/**
 * @author srava
 * 
 *         program to get a option from user ( 1- add, 2- sub, 3- mul, 4- div)
 *         and two numbers to perfrom the basic calc operation. USE SWITCH
 *         statement
 * 
 */

public class CalculatorOperation {

	public static void main(String args[]) {

		int userinput;
		int x, y, result; // for all operations

		String userdata;

		Scanner reader = new Scanner(System.in);
		System.out
				.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division");
		userinput = reader.nextInt();

		System.out
				.println("please enter the values of x and y for the further operation");
		x = reader.nextInt();
		y = reader.nextInt();

		switch (userinput) {

		case 1:
			userdata = "add";
			result = x + y;
			System.out.println(result);
			break;
		case 2:
			userdata = "subtract";
			result = x - y;
			System.out.println(result);
			break;
		case 3:
			userdata = "multiply";
			result = x * y;
			System.out.println(result);
			break;

		case 4:
			userdata = "divide";
			result = x / y;
			System.out.println(result);
			break;

		default:
			System.out.println("I dont know more of math");

		}

	}
}