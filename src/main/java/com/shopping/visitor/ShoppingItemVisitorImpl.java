package com.shopping.visitor;
import java.math.BigDecimal;

import com.shopping.fruit.Fruit;

public class ShoppingItemVisitorImpl implements ShoppingItemVisitor {

	@Override
	public BigDecimal visit(Fruit fruit) {
		BigDecimal cost= fruit.getPrice().multiply(fruit.getQuantity());
		System.out.println(fruit.getName() + " Cost = "+ cost);
		return cost;
	}

}
