package com.shopping.visitor;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;
import org.mockito.Mockito;

import com.shopping.fruit.Fruit;

public class ShoppingItemVisitorImplTest {

	@Test
	public void testCost() {
	
		Fruit fruit = Mockito.mock(Fruit.class);
		Mockito.when(fruit.getQuantity()).thenReturn(new BigDecimal(10));
		Mockito.when(fruit.getPrice()).thenReturn(new BigDecimal(10));
		Mockito.when(fruit.getName()).thenReturn("Apples");
		
		ShoppingItemVisitorImpl visitor = new ShoppingItemVisitorImpl();
		assertEquals(new BigDecimal(100),visitor.visit(fruit));
	}

}
