package com.codility.test.animal.impl;

import com.codility.test.animal.Bird;
import com.codility.test.animal.SingableAnimal;
import com.codility.test.animal.SwimableAnimal;

public class Duck implements Bird, SingableAnimal, SwimableAnimal {
	public String swim() {
		return "Duck,swim";
	}

	public String sing() {
		return "Quack,quack";
	}

}
