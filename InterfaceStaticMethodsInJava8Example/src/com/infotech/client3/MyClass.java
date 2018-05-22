package com.infotech.client3;

import com.infotech.myinterfaces.MyInterface;

public class MyClass implements MyInterface {
	// provides implementation for the non-default method of the interface
	@Override
	public int method1() {
		return 20;
	}

	// Overriding the default method of MyInterface
	@Override
	public String displayGreeting() {
		return MyInterface.super.displayGreeting();
	}
	//Hiding interface static method-implementing class can hide the interface 
	//static method in Java by providing method with same signature in the
	//implementing class.
	public static int getDefaultAmount() {
		return 5;
	}

	public static void main(String[] args) {
		MyInterface myInterface = new MyClass();
		String displayGreeting = myInterface.displayGreeting();
		System.out.println(displayGreeting);

		int amount = MyInterface.getDefaultAmount();
		System.out.println("Amount from Interface: " + amount);
		System.out.println("Amount from MyClass: " + MyClass.getDefaultAmount());
	}
}