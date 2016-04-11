package com.shopping.visitor;

import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.Mockito;

import com.shopping.fruit.Fruit;

public class ShoppingItemVisitorImplTest {

	@Test
	public void testCost() {
	
		Fruit fruit = Mockito.mock(Fruit.class);
		Mockito.when(fruit.getQuantity()).thenReturn(10f);
		Mockito.when(fruit.getPrice()).thenReturn(10f);
		Mockito.when(fruit.getName()).thenReturn("Apples");
		
		ShoppingItemVisitorImpl visitor = new ShoppingItemVisitorImpl();
		assertEquals(100,visitor.visit(fruit),0.001);
	}

}
