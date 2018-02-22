package com.n2services;

/**
 * @author srava
 *
 */
public class StringConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "good day";
		String s2 = "bad day";
		String s3 = "goodday";
		String s4 = "goodday";
		String s5 = "Goodday";
		String s6 = "i-will-be-sad-once-in-a-blue-moon";
		// length()
		System.out.println("today is a" + "   " + s1 + "    " + s1.length()
				+ "    " + s1.length() + "   " + s3.length());
		// charAt
		System.out.println(s1.charAt(3));
		// equals
		if (!s3.equals(s4)) {
			System.out.println("not equal");
		} else
			System.out.println("equals");

		// equalsIgnoreCase
		if (s3.equalsIgnoreCase(s4)) {
			System.out.println("ignoring case and s3 equals s4");
		} else
			System.out.println("not equal");

		// startWith()
		System.out.println(s6.startsWith("i"));
		// endsWith()
		System.out.println(s6.endsWith("moon"));

		// split()
		String string = "1234-5678";
		String[] parts = string.split("-");
		String part1 = parts[0];
		String part2 = parts[1];
		System.out.println(part1);
		System.out.println(part2);

		// trim()
		String totrim = " 12345                     ";
		String tingtong = "112       ";
		System.out.println(totrim.trim() + tingtong + totrim + tingtong);

		// toLowerCase()
		String smallcaps = "Dimpi";
		System.out.println(smallcaps.toLowerCase());
		// toUpperCase()
		System.out.println(smallcaps.toUpperCase());
		// indexOf()

		int x = s6.indexOf('b');
		System.out.println(x);
		// displays b after 9th index
		int y = s6.indexOf('b', 9);
		System.out.println(y);
		
		int z = s6.indexOf("be");
		System.out.println(z);
		
		//substring 
System.out.println("substring starting from index 9 to 15"+ s6.substring(9,15));
System.out.println(s6.substring(9));
	}

}
