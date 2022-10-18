package com.interview.singtel.animal.service;

import com.interview.singtel.animal.beans.*;
import com.interview.singtel.animal.beans.Cat;
import com.interview.singtel.animal.behaviours.AnimalActivity;
import com.interview.singtel.animal.constants.AnimalEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class AnimalService {

	private List<Animal> animals;

	@PostConstruct
	void init() {
		animals = new ArrayList<>();
		animals.add(new Butterfly());
		animals.add(new Cat());
		animals.add(new Caterpillar());
		animals.add(new Chicken());
		animals.add(new Clownfish());
		animals.add(new Dog());
		animals.add(new Dolphins());
		animals.add(new Duck());
		animals.add(new Parrot(new Dog()));
		animals.add(new Parrot(new Cat()));
		animals.add(new Parrot(new Rooster()));
		animals.add(new Rooster());
		animals.add(new Shark());
	}

	public int count(Class<? extends AnimalActivity> activity) {
		return (int) animals.stream().filter(activity::isInstance).count();
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
		log.debug("{} is added to animals list successfully", animal);
	}

	public void deleteAnimal(Animal animal) {
		animals.remove(animal);
		log.debug("{} is deleted from animals list successfully", animal);
	}

	public List<String> modifyList(List<Animal> animalList) {
		animals.clear();
		log.debug("ALl the elements from the animals list deleted");
		animals.addAll(animalList);
		log.debug("new Animal list is modified the animals list");
		return getAnimals();
	}

	public List<String> getAnimals() {
		return AnimalEnum.getAnimals();
	}

}
