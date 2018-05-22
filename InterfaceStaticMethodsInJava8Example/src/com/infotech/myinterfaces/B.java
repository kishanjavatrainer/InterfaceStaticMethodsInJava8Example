package com.infotech.myinterfaces;

public interface B extends MyInterface {
	default String displayGreeting() {
		//Static interface methods are not inherited by-Extending interfaces
		//B.getDefaultAmount(); // Compiler Error
		return "Hello from MyInterface";
	}
}