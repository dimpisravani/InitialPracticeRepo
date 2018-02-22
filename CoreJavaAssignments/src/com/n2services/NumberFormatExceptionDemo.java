package com.n2services;

public class NumberFormatExceptionDemo{

	public void findEnteredValue(String a, String b){
		int i, j;
	try {
        i = Integer.parseInt(a);
        j = Integer.parseInt(b);
    }
    catch(NumberFormatException e) {
        System.out.println(
            "Entered Number must be an integer");
        System.out.println(e.getMessage());
        return;
	
    }}
}
	
/*	public void findEnteredValue(String a, String b){
		int i, j;
	try {
        i = Integer.parseInt(a);
        j = Integer.parseInt(b);
    }
    catch(NumberFormatException e) {
        System.out.println(
            "Entered Number must be an integer");
        System.out.println(e.getMessage());
        return;
    }
	}

}*/
