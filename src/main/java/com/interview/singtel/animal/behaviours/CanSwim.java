package com.interview.singtel.animal.behaviours;

public interface CanSwim extends AnimalActivity {

	default void swim() {
		System.out.println("I am swimming");
	}

}
