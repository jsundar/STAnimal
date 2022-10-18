package com.interview.singtel.animal.beans;

import com.interview.singtel.animal.behaviours.CanMakeSound;

public class Chicken extends WalkingAnimal implements CanMakeSound {

	@Override
	public void makeSound() {
		System.out.println("Cluck, cluck");
	}

}
