package com.fleetrental.model.domain;

import junit.framework.TestCase;

public class CarTest extends TestCase{

   /**
    * Tests with a valid car passed in
    */
	public void testValidate() {
		Car c1 = new Car (28.9f, "Lotus", "Elise", "100");
		// c1.validate should assert to True since all variables 
		// being passed to create a new Car are all valid.
		assertTrue ("c1 validates", c1.validate());
	       System.out.println("testValidate PASSED");
	}

	/**
	 * Tests with an invalid car passed in
	 */
	public void testNotValidate() {
		Car c1 = new Car ();
		// c1.validate should not pass here since we are not
		// sending in valid parameters - in the case of Car
		// class, its valid only if all class variables are passed
		assertFalse ("c1 does not validate", c1.validate());
	       System.out.println("testNotValidate PASSED");		
	}
	

	/**
	 * Tests if two cars are equal
	 */
	public void testEqualsCar() {
		System.out.println("starting testEqualsCar()");
		Car c1 = new Car (28.9f, "Lotus", "Elise", "100");
		Car c2 = new Car (28.9f, "Lotus", "Elise", "100");
		// this should assert to true since the contents of 
		// c1 and c2 class variables are identical.
		assertTrue ("c1 equals c2", c1.equals(c2));
	       System.out.println("testEqualsCar PASSED");		
	}


	/**
	 * Tests if two cars are not equal
	 */
	public void testNotEqualsCar() {
		System.out.println("starting testNotEqualsCar()");
		Car c1 = new Car (28.9f, "Lotus", "Elise", "100");
		Car c2 = new Car (28.9f, "Ferrari", "Diablo", "100");
		// this should assert to false since the contents of 
		// c1 and c2 class variables are NOT identical.
		assertFalse ("c1 does NOT equal c2", c1.equals(c2));
	       System.out.println("testNotEqualsCar PASSED");		
	}

}
