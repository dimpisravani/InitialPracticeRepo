package com.n2services;

import java.util.*;

// one to 100 from user and print the prime numbers less than the input number.. if statements//

public class PrintPrime {

	public static void main(String args[]) {

		int n;

		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a number: ");

		n = reader.nextInt();

		for (int j = 0; j <= n; j++)
			for (int i = j; i <= 100; i++)

				if (i % 2 != 0)

					System.out.println(i);
				else
					break;

	}

}
