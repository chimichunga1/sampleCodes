package com.accenture.demo.unittest;

import com.accenture.demo.exception.IdolException;

public class Calculate {

	public int add(int a, int b, int c) throws IdolException{

		int result = a+b+c;

		if (result > 99){
			throw new IdolException("Ayaw ni Idol yan.");
		}

		return result;
	}

}
