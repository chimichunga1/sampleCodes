package com.accenture.demo.inheritance;

public class Honda extends Car{

	public void transform(){
		System.out.println( getModel() + " transformed!");
	}

	@Override
	public void accelerate(){
		super.accelerate();
		System.out.println(getModel() + " is moving slow...");
	}

	public void accelerate(int speed){
		System.out.println(getModel() + " is moving at " + speed + "mph");
	}

}
