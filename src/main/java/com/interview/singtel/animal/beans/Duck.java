package com.interview.singtel.animal.beans;

import com.interview.singtel.animal.behaviours.CanMakeSound;
import com.interview.singtel.animal.behaviours.CanSwim;

public class Duck extends FlyingBird implements CanMakeSound, CanSwim {

	@Override
	public void makeSound() {
		System.out.println("Quack, quack");
	}

}