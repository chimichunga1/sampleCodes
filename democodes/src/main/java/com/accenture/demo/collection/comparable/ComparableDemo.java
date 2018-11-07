package com.accenture.demo.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {

		List<Person> people = new ArrayList<Person>();

		people.add(new Person("Ady",20));
		people.add(new Person("Ted", 5));
		people.add(new Person("Mahal", 10));
		people.add(new Person("Buboy", 68));
		people.add(new Person("Kagawad",70));

		System.out.println("Before Sorting");
		people.forEach(p -> {
			System.out.println(p);
		});

		Collections.sort(people);

		System.out.println("\nAfter Sorting");
		people.forEach(p -> {
			System.out.println(p);
		});

	}
}
