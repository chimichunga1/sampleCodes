package com.accenture.demo.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

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

		//using anonymous inner class
		/*Collections.sort(people,new Comparator<Person>() {

			@Override
			public int compare(Person arg0, Person arg1) {
				// TODO Auto-generated method stub
				return arg0.getAge() - arg1.getAge();
			}
		});*/

		/*PersonAgeComparator ac = new PersonAgeComparator();
		Collections.sort(people, ac);*/

		Collections.sort(people, new PersonAgeComparator());

		System.out.println("\nAfter Sorting");
		people.forEach(p -> {
			System.out.println(p);
		});

	}

}
