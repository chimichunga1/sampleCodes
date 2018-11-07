package com.accenture.demo.abstraction;

public class Programmer extends Person {

	@Override
	public void study() {
		System.out.println(getName()
				+ " is reading manga and watching anime.");

	}

	public void eat() {
		System.out.println("Programmer is eating steak");

	}

	public void sleep() {
		System.out.println("Programmers can no longer sleep");

	}

	public void walk() {
		System.out.println("Programmer can no longer walk");

	}

}
