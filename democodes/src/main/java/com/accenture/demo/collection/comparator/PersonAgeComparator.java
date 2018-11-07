package com.accenture.demo.collection.comparator;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person arg0, Person arg1) {
		// TODO Auto-generated method stub
		return arg0.getAge() - arg1.getAge();
	}

}
