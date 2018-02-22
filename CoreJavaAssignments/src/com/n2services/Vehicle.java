package com.n2services;

public class Vehicle {
	int speed=0; 
	int gear = 1;
	String color ="Black";
	
	void changeGear(int newValue){
		gear = newValue;
	}
	Void speedUp(int increment){
		
		speed  = speed+increment;
		return null;
		
	}
	
	void applyBrakes(int decrement){
		
	speed = speed - decrement	;
	
	}
	
	void printStates(){
		System.out.println("color"+ color);
		System.out.println("speed"+ speed);
		System.out.println("gear"+ gear);
		
		
	
	
	
	}

}
