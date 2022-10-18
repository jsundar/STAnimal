package com.interview.singtel.animal.beans;

public interface Animal {

	default String getName() {
		return this.getClass().getSimpleName();
	}

}
