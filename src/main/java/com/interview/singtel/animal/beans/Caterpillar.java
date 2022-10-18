package com.interview.singtel.animal.beans;

import com.interview.singtel.animal.behaviours.Transformable;

public class Caterpillar extends WalkingAnimal implements Transformable {

	@Override
	public Animal transform() {
		return new Butterfly();
	}

}
