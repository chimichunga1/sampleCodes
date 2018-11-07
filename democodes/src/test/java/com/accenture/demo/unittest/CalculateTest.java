package com.accenture.demo.unittest;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.accenture.demo.exception.IdolException;

public class CalculateTest extends TestCase {

	Calculate calculate;

	@Before
	public void setUp(){
		calculate = new Calculate();
	}

	@After
	public void tearDown(){
		calculate = null;
	}

	@Test
	public void testAddPostive(){

		int a = 10;
		int b = 20;
		int c = 30;

		try {
			assertEquals(a+b+c, calculate.add(a,b,c));
		} catch (IdolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testAddNegative(){

		int a = 10;
		int b = 20;
		int c = 70;

		try {
			calculate.add(a,b,c);
		} catch (IdolException e) {
			assertEquals("Ayaw ni Idol yan.", e.getMessage());
		}

	}




}
