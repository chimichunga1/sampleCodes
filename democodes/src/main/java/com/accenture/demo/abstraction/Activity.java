package com.accenture.demo.abstraction;

public interface Activity {

	public static final String DOG_FOOD = "Pedigree";
	public static final String CAT_FOOD = "555";

	public abstract void eat();
	public abstract void sleep();
	public abstract void walk();

}
