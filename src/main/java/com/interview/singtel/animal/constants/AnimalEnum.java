package com.interview.singtel.animal.constants;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.interview.singtel.animal.beans.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public enum AnimalEnum {

	// @formatter:off
	butterfly("butterfly", new Butterfly()),
	cat("cat", new Cat()),
	caterPillar("caterPillar", new Caterpillar()),
	chicken("chicken", new Chicken()),
	clownfish("clownfish", new Clownfish()),
	dog("dog", new Dog()),
	dolphins("dolphins", new Dolphins()),
	duck("duck", new Duck()),
	parrot("parrot", new Parrot(new Dog())),
	rooster("rooster", new Rooster()),
	shark("shark", new Shark());

	// @formatter:on

	private final String name;

	private final Animal animal;

	@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
	public static AnimalEnum fromName(String name) {
		for (AnimalEnum animalEnum : AnimalEnum.values()) {
			if (animalEnum.getName().equals(name)) {
				return animalEnum;
			}
		}
		throw new IllegalArgumentException();
	}

	@Override
	public String toString() {
		return this.name;
	}

	public static List<String> getAnimals() {
		List<String> animalEnums = new ArrayList<>();
		animalEnums.add(butterfly.getName());
		animalEnums.add(cat.getName());
		animalEnums.add(caterPillar.getName());
		animalEnums.add(chicken.getName());
		animalEnums.add(clownfish.getName());
		animalEnums.add(dog.getName());
		animalEnums.add(dolphins.getName());
		animalEnums.add(duck.getName());
		animalEnums.add(parrot.getName());
		animalEnums.add(rooster.getName());
		animalEnums.add(shark.getName());

		return animalEnums;
	}

}
