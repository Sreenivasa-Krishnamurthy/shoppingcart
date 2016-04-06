package com.shopping.visitor;

import static org.junit.Assert.*;
import org.junit.Test;
import com.shopping.fruit.Fruit;

public class ShoppingItemVisitorImplTest {

	@Test
	public void testCost() {
		Fruit fruit = new Fruit("Apples", 10,10);
		ShoppingItemVisitorImpl visitor = new ShoppingItemVisitorImpl();
		assertEquals(100,visitor.visit(fruit),0.001);
	}

}
