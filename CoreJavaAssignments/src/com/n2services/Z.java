package com.n2services;



	public class Z
	{
	   public static void main (String args []) {
		   
		   
		   
		   
	       X a1 = new X(); // Reference and object X
	       Y b1 = new Y(); // X reference but Y object
	       Y b2 = new Y();
	       
	       
	       
	       
	       a1=b1;
	      //b2 = a1;
	       b2= (Y) a1;
	       
	       
	       
	      // Y obj3 = (Y) new X();
	       /*
      
	       obj1.methodA();
	       obj2.methodA();
	       obj3.methodA();*/
	       
	   }
	}

