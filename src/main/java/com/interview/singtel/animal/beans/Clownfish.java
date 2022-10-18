package com.interview.singtel.animal.beans;

public class Clownfish extends Fish {

	public Clownfish() {
		super("Small", "colourful (orange)");
	}

	@Override
	public void act() {
		System.out.println("Clownfish make jokes");
	}

}