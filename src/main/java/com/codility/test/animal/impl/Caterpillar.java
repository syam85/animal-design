package com.codility.test.animal.impl;

import com.codility.test.animal.WalkableAnimal;

public class Caterpillar implements WalkableAnimal {

	public String walk() {
		return "Caterpillar, walk";
	}

	public Butterfly applyTransformation() {
		return new Butterfly();
	}

}
