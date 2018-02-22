package com.n2services;

import java.util.*;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int NumberGuess = rand.nextInt(1000);
		int NumberOfTries = 0;
		Scanner userinput = new Scanner(System.in);
		boolean win = false;

		// System.out.println(NumberGuess);
		int guess;

		while (win == false) {

			System.out.println("enter your guess");
			guess = userinput.nextInt();

			NumberOfTries++;
		
			if (guess == NumberGuess) {
				win = true;

				System.out.println("you guessed it right");
			} else if (guess < NumberGuess)
				System.out.println("TOOLow");
			else if (guess > NumberGuess)
				System.out.println("TOOHigh");
		}

	}
}
