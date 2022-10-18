package com.interview.singtel.animal.beans;

public class Shark extends Fish {

	public Shark() {
		super("Large", "Grey");
	}

	@Override
	public void act() {
		System.out.println("Sharks eat other fish");
	}

}
