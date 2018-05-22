package com.infotech.client2;

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

	public static void main(String[] args) {
		
		int amount = MyInterface.getDefaultAmount();
		System.out.println("Amount: " + amount);
		MyInterface myInterface = new MyClass();
		String displayGreeting = myInterface.displayGreeting();
		System.out.println(displayGreeting);
		//Static interface methods are not inherited by-Implementing classes
		//MyClass.getDefaultAmount(); // Compiler error
		//myInterface.getDefaultAmount();// Compiler error
	}
}