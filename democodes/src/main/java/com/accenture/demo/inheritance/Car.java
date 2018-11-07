package com.accenture.demo.inheritance;

public class Car {

	private int numberOfWheels;
	private String engineType;
	private String color;
	private String model;

	public Car(int numberOfWheels, String engineType, String color, String model) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.engineType = engineType;
		this.color = color;
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car(int numberOfWheels, String engineType, String color) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.engineType = engineType;
		this.color = color;
	}

	public Car() {
		super();
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void accelerate(){
		System.out.println(model + " is moving.");
	}

}
