package com.accenture.demo;

public class Demo {

	String name;

	public Demo(){
		System.out.println("Default Constructor Invoked");
	}

	public Demo(String name){
		this.name = name;
	}



	public static void main(String[] args) {
		System.out.println("Hello There!");

		Demo demo = new Demo("Marlon");
		Demo demo2 = new Demo("Rej");


//		demo.main("Marlon");
		demo.main();
		demo2.main();
	}

	public void main(String args) {
		System.out.println("Hi " + args);
	}

	public void main() {
		System.out.println("Hi " + name);
	}




}
