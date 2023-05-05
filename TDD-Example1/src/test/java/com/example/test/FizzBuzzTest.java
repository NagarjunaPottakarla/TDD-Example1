package com.example.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.example.tdd.FizzBuzz;

public class FizzBuzzTest {
	
	
	private FizzBuzz fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void testNumber() {
		
		int expected=1;
		String numberReturn = fizzBuzz.play(expected);
		Assert.assertEquals("1", numberReturn);
		
	}

}
