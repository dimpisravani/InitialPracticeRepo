package com.n2services;

/**
 * @author srava
 *
 */
public class BikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike v1 = new Bike();
		Bike v2 = new Bike();
		
	v1.speedUp(80);
	v1.changeGear(2);
	v1.changeColor("Blue");
	System.out.println("bike1");
	v1.printStates();
	
	v2.speedUp(100);
	v2.changeGear(4);
	v2.changeColor("red");
	System.out.println("bike2");
	v2.printStates();
	
	}

}
