package com.interview.singtel.animal.behaviours;

public interface CanWalk extends AnimalActivity {

	default void walk() {
		System.out.println("I am walking");
	}

}