package com.shopping.fruit;


import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;
import org.mockito.Mockito;

import com.shopping.visitor.ShoppingItemVisitor;

public class FruitTest {

	@Test(expected = IllegalArgumentException.class)
	public void testQuantityNegative() {
		Fruit fruit = new Fruit("Bananas", new BigDecimal(10), new BigDecimal(-5));
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testPriceNegative() {
		Fruit fruit = new Fruit("Bananas", new BigDecimal(-5),new BigDecimal(10));
	}
	
	@Test
	public void testPricePositive() {
		Fruit fruit = new Fruit("Bananas", new BigDecimal(5),new BigDecimal(10));
		assertEquals(new BigDecimal(5.0), fruit.getPrice());
	}
	
	@Test
	public void testQuantityPositive() {
		Fruit fruit = new Fruit("Bananas", new BigDecimal(5),new BigDecimal(10));
		assertEquals(new BigDecimal(10.0), fruit.getQuantity());
	}
	
	@Test
	public void testCost() {
		Fruit fruit = new Fruit("Apples", new BigDecimal(10),new BigDecimal(10));
		ShoppingItemVisitor mockShoppingVisitor = Mockito.mock(ShoppingItemVisitor.class);
		Mockito.when(mockShoppingVisitor.visit(fruit)).thenReturn(new BigDecimal(100));
		assertEquals(new BigDecimal(100),fruit.accept(mockShoppingVisitor));
	}
}
