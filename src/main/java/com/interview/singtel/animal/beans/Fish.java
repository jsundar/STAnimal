package com.interview.singtel.animal.beans;

import com.interview.singtel.animal.behaviours.CanSwim;
import com.interview.singtel.animal.behaviours.FishAction;

public abstract class Fish implements Animal, CanSwim, FishAction {

	private String size;

	private String colour;

	public Fish(String size, String colour) {
		this.size = size;
		this.colour = colour;
	}

}
