package com.codility.test.animal.impl;

import com.codility.app.animal.Bird;
import com.codility.app.animal.SingableAnimal;
import com.codility.app.animal.SwimableAnimal;

public class Duck implements Bird, SingableAnimal, SwimableAnimal {
	public String swim() {
		return "Duck,swim";
	}

	public String sing() {
		return "Quack,quack";
	}

}
