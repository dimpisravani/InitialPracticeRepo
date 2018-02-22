package com.n2services;

public class VehicleTest {
	
	public static void main (String[] args){
	
	Vehicle v1 = new Vehicle ();
	Vehicle v2 = new Vehicle();
	v1.speedUp(10);
	v1.changeGear(2);
	v2.speedUp(30);
	v2.changeGear(5);
	System.out.println("v1 details as follows");
	v1.printStates();
	System.out.println();
	System.out.println("v2 details as follows");
	v2.printStates();
	
	//
	
	
	
	}

}
