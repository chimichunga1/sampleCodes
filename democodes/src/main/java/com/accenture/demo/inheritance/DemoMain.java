package com.accenture.demo.inheritance;

public class DemoMain {

	public static void main(String[] args) {

		Car car = new Car();

		car.setColor("Red");
		car.setEngineType("TypePo");
		car.setNumberOfWheels(5);
		car.setModel("RedHorse");

		System.out.println(car.getColor());
		System.out.println(car.getEngineType());
		System.out.println(car.getNumberOfWheels());

		car.accelerate();

		Car car2 = new Car(5,"Horse","Brown", "Kariton");

		car2.setEngineType("Carabao");

		System.out.println(car2.getColor());
		System.out.println(car2.getEngineType());
		System.out.println(car2.getNumberOfWheels());

		car2.accelerate();

		Honda honda = new Honda();

		honda.setColor("White");
		honda.setEngineType("Tide");
		honda.setNumberOfWheels(7);
		honda.setModel("Civic");

		System.out.println(honda.getColor());
		System.out.println(honda.getNumberOfWheels());
		System.out.println(honda.getEngineType());
		honda.accelerate();
		honda.accelerate(5);
		honda.transform();


		Object x = new Car();

			}

}
