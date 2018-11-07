package com.accenture.demo.collection.comparable;

public class Person implements Comparable<Person>{

	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "name :" + name + ", age :" + age;
	}

	@Override
	public int compareTo(Person arg0) {
		return age-arg0.age;
	}

	/*@Override
	public int compareTo(Object arg0) {
		Person p = (Person)arg0;

		if (age > p.age){
			return 1;
		} else if(age < p.age){
			return -1;
		} else {
			return 0;
		}
	}*/



}
