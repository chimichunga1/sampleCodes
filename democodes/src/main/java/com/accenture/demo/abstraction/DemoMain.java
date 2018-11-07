package com.accenture.demo.abstraction;

public class DemoMain {

	public static void main(String[] args) {
		Student student = new Student();

		student.setName("Ady");
		student.walk();
		student.study();
		student.eat();
		student.sleep();

		Programmer dev = new Programmer();

		dev.setName("Ted");
		dev.walk();
		dev.study();
		dev.eat();
		dev.sleep();

		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.eat();
	}

}
