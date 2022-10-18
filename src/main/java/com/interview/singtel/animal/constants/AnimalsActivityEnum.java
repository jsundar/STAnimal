package com.interview.singtel.animal.constants;

import com.interview.singtel.animal.behaviours.*;

public enum AnimalsActivityEnum {

	//@formatter:off
	fly(CanFly.class),
	walk(CanWalk.class),
	swim(CanSwim.class),
	sing(CanSing.class),
	talk(CanMakeSound.class);
	//@formatter:on

	Class<? extends AnimalActivity> animalActivity;

	AnimalsActivityEnum(Class<? extends AnimalActivity> animalActivity) {
		this.animalActivity = animalActivity;
	}

	public Class<? extends AnimalActivity> getAnimalActivity() {
		return animalActivity;
	}

}
