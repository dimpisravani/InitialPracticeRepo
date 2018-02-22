package com.n2services;

// Fibonacci sequence using recursive function calls

// without using recursive function calls
/*
 * public static void main(String args[])
 * 
 * {
 * 
 * int n0, n1, n2, i, count = 10;
 * 
 * n0 = 0; n1 = 1; n2 = 0;
 * 
 * System.out.println(n0 + n1);
 * 
 * for (i = 0; i <= count; i++) { n2 = n0 + n1;
 * 
 * System.out.println("s     " + n2); n0 = n1; n1 = n2;
 * 
 * }
 * 
 * }
 */
//*******************trying recursive function//
public class Fibonacci {
	static int n0 = 0, n1 = 1, n2 = 0;

	static void fib(int count) {
		
 if(count >0){
		n2 = n0 + n1;
		
		
		n0 = n1;
		n1 = n2;

		System.out.println(n2);
		fib(count-1);

	}
	}

	public static void main(String args[]) {
		
		int count = 10;

		System.out.println(n0+"    "+ n1);
		fib(count-2);
	}

}