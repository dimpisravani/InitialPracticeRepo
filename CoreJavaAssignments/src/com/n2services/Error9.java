package com.n2services;

import java.util.*;

/**
 * @author srava
 * 
 */
public class Error9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter a value:");
			String str = scan.nextLine();
			int a = Integer.parseInt(str);
			System.out.println("Valid integer:" + a);

			System.out.println("Enter b value:");
			String str1 = scan.next();
			int b = Integer.parseInt(str1);
			System.out.println("Valid integer:" + b);

		} catch (NumberFormatException e) {

			System.out.println("Number format exception occurred");
			System.out.println(e.getMessage());

		}

	}
}
