package com.shopping.fruit;


import static org.junit.Assert.*;

import org.junit.Test;

import com.shopping.visitor.ShoppingItemVisitorImpl;

public class FruitTest {

	@Test(expected = IllegalArgumentException.class)
	public void testQuantityNegative() {
		Fruit fruit = new Fruit("Bananas", 10,-5);
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPriceNegative() {
		Fruit fruit = new Fruit("Bananas", -5,10);
	}
	
	@Test
	public void testPricePositive() {
		Fruit fruit = new Fruit("Bananas", 5,10);
		assertEquals(5.0f, fruit.getPrice(),0.001);
	}
	
	@Test
	public void testQuantityPositive() {
		Fruit fruit = new Fruit("Bananas", 5,10);
		assertEquals(10.0f, fruit.getQuantity(),0.001);
	}
	
	@Test
	public void testCost() {
		Fruit fruit = new Fruit("Apples", 10,10);
		ShoppingItemVisitorImpl visitor = new ShoppingItemVisitorImpl();
		assertEquals(100,fruit.accept(visitor),0.001);
	}
}
