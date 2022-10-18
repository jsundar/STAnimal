package com.interview.singtel.animal.behaviours;

public interface CanFly extends AnimalActivity {

	default void fly() {
		System.out.println("I am flying");
	}

}