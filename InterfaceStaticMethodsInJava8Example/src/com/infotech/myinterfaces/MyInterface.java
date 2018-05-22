package com.infotech.myinterfaces;

public interface MyInterface {
	int method1();

	// default method, providing default implementation
	default String displayGreeting() {
		return "Hello from MyInterface";
	}

	// static method
	static int getDefaultAmount() {
		return 0;
	}
}