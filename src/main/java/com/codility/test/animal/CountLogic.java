package com.codility.test.animal;

import java.util.ArrayList;
import java.util.List;

import com.codility.test.animal.impl.Butterfly;
import com.codility.test.animal.impl.Cat;
import com.codility.test.animal.impl.Caterpillar;
import com.codility.test.animal.impl.Clownfish;
import com.codility.test.animal.impl.Dog;
import com.codility.test.animal.impl.Dolphin;
import com.codility.test.animal.impl.Duck;
import com.codility.test.animal.impl.Parrot;
import com.codility.test.animal.impl.Rooster;
import com.codility.test.animal.impl.Shark;

public class CountLogic {

	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Duck());
		animals.add(new Rooster());
		animals.add(new Clownfish());
		animals.add(new Dolphin());
		animals.add(new Shark());
		animals.add(new Butterfly());
		animals.add(new Parrot());
		animals.add(new Cat());
		animals.add(new Caterpillar());
		animals.add(new Dog());

		int fly_c = 0;
		int sing_c = 0;
		int walk_c = 0;
		int swim_c = 0;

		for (Animal animal : animals) {
			if (animal instanceof SingableAnimal) {
				sing_c++;
			}
			if (animal instanceof FlyableAnimal) {
				fly_c++;
			}

			if (animal instanceof WalkableAnimal) {
				walk_c++;
			}

			if (animal instanceof SwimableAnimal) {
				swim_c++;
			}

		}

		System.out.println("Flyable Animals:" + fly_c);
		System.out.println("Singable Animals:" + sing_c);
		System.out.println("Walkable Animals:" + walk_c);
		System.out.println("Swammable Animals:" + swim_c);
	}

}
