package com.accenture.demo.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo ed = new ExceptionDemo();

		try {

			double result = ed.divide(10, 10);
			System.out.println(result);

		} catch (ArithmeticException e) {
			System.out.println("Cannot be, borrow from idol");
		} catch (IdolException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}


	}


	private double divide(int a, int b) throws IdolException {

		double result = a/b;

		if (result == 1){
			throw new IdolException("Ayaw ni Idol yan.");
		}


		return result;
	}

}
