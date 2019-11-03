package com.codility.test.animal.impl;

import com.codility.app.animal.SwimableAnimal;

public abstract class Fish implements SwimableAnimal {

	public String swim() {
		return "Fish,swim";
	}

	public abstract String color();

	public abstract String size();

}
