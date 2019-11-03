package com.codility.app.animal;

public abstract class Chicken implements Bird, SingableAnimal {
	public String sing() {
		return "Cluck, cluck";
	}
}
