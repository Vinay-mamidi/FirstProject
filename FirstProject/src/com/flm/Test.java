package com.flm;

import com.flm.cart.Cart;

import com.flm.db.DataBase;

import com.flm.payment.*;

public class Test {
	
	int age=27;
	
	public static void main(String[] args) {
/*	creation of object for class
		calssname objectname = new classname();*/
		
		Test t = new Test();
		System.out.println(t.age);
		
		System.out.println(Cart.b);// static varaibles can be accessed directly with class name
	
	    DataBase d = new DataBase();
	     d.connect();
	     
	     Payment.paymentDone();// static methods can access directly with classname 
	     
	}

}
