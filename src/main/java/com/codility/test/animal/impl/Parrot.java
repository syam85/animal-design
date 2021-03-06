package com.codility.test.animal.impl;

import com.codility.app.animal.Animal;
import com.codility.app.animal.Bird;
import com.codility.app.animal.FlyableAnimal;
import com.codility.app.animal.SingableAnimal;

public class Parrot implements Bird, SingableAnimal, FlyableAnimal {

	private Animal nearOrLivesWith;

	public Parrot() {

	}

	public String sing() {
		if (nearOrLivesWith != null) {
			if (nearOrLivesWith instanceof Dog) {
				return "Woof, woof";
			} else if (nearOrLivesWith instanceof Cat) {
				return "Meow";
			} else if (nearOrLivesWith instanceof Rooster) {
				return "Cock-a-doodle-doo";
			}
		}

		return "Parrot,sing";
	}

	public void setLivesWith(Animal animal) {
		this.nearOrLivesWith = animal;
	}

	@Override
	public String fly() {
		return "Parrot, flies";
	}

}
