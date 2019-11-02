package com.codility.test.animal;

public abstract class Chicken implements Bird, SingableAnimal {
	public String sing() {
		return "Cluck, cluck";
	}
}
