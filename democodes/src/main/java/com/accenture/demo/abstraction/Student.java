package com.accenture.demo.abstraction;

public class Student extends Person {

	@Override
	public void study() {
		System.out.println(getName() + " is reading manga.");

	}

	public void eat() {
		System.out.println("Student is eating luckyme everyday");

	}

	public void sleep() {
		System.out.println("Student is sleeping 16hrs a day");

	}

	public void walk() {
		System.out.println("Student is walking dahil walang pera");

	}



}
