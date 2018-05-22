package com.infotech.client1;

import com.infotech.myinterfaces.MyInterface;

public class MyClass {
	public static void main(String[] args) {
		int amount = MyInterface.getDefaultAmount();
		System.out.println("Amount: " + amount);
	}
}