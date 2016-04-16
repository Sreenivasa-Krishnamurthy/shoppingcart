package com.shopping.visitor;
import com.shopping.fruit.Fruit;

public class ShoppingItemVisitorImpl implements ShoppingItemVisitor {

	@Override
	public float visit(Fruit fruit) {
		float cost= fruit.getPrice() * fruit.getQuantity();
		System.out.println(fruit.getName() + " Cost = "+ cost);
		return cost;
	}

}
