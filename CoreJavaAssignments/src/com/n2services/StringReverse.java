package com.n2services;

import java.io.*;
import java.util.*;

public class StringReverse {

	// usinG String.charAt(), String.equals(), and String.length()

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// char emo it will display the character at specific index int index1 =
		// str.charAt(0);
		int count;
		String iscan = "";
		Scanner reader = new Scanner(System.in);

		System.out.println("Please enter the word" + iscan);
		iscan = reader.nextLine();

		char[] ichar = iscan.toCharArray();

		for (int i = ichar.length - 1; i >= 0; i--)
			System.out.print(ichar[i]);
	}

	// char seq;

}
