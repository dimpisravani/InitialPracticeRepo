package com.n2services;

import java.util.Scanner;

public class GradeCode {

	public static void main(String[] args) {

		int userinput;

		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter the number to calculate the grade");
		userinput = reader.nextInt();

		int grade;

		
		
			grade = userinput / 10;

			//System.out.println("Print the grade,   " + grade);
		
			if ((userinput <=100) && (grade == 10))
				
				System.out.println("Perfect Score   " + grade);
			else if (grade == 9)
				System.out.println("Excellent   " + grade);
			else if (grade == 8)
				System.out.println("Nice job   " + grade);
			else if (grade == 7)
				System.out.println("Average   " + grade);
			else if (grade < 7)
				System.out.println("Below Average   " + grade);
			
			else 
					System.out.println("No grades");
		}
	}


