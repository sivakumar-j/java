package com.basics.packageone;

import java.util.ArrayList;
import java.util.List;

// upper bound means ..upper is bounded ..lower is free..free to choose from lower range
// lower bound means.. lower is bounded.. upper is free...free to choose from upper range

public class n11_Generics_Lowerbound {

	public static void addCat(List<? super Cat> catList) {
		catList.add(new BlackCat());
		System.out.println("Cat Added");
	}

	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		List<Cat> catList = new ArrayList<Cat>();
		List<BlackCat> blackCatList = new ArrayList<BlackCat>();
		List<Dog> dogList = new ArrayList<Dog>();

		// add list of super class Animal of Cat class
		addCat(animalList);

		// add list of Cat class
		addCat(catList);

		// compile time error
		// can not add list of subclass blackCat of Cat class
		// addCat(blackCatList);

		// compile time error
		// can not add list of subclass Dog of Superclass Animal of Cat class
		// addCat.addMethod(dogList);
	}

}

class Animal {
}

class Cat extends Animal {
}

class BlackCat extends Cat {
}

class Dog extends Animal {
}
