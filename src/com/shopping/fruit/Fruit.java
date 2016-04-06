package com.shopping.fruit;

import com.shopping.item.ShoppingItem;
import com.shopping.visitor.ShoppingItemVisitor;

/* Represents the fruit object.
 * Visitor design pattern is used to calculate
 * the cost of each item. Price and Quantity
 * cannot be zero or negative.
 */

public class Fruit implements ShoppingItem{
	private String name;
	private float price;
	private float quantity;
	
	public Fruit(String name, float price, float quantity) {
		
		if ( price <= 0) {
			throw new IllegalArgumentException("Price cannot be negative or zero");
		}
		
		if (quantity <= 0) {
			throw new IllegalArgumentException("Quantity cannot be negative or zero");
		}
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
				
	}
	
	public String getName() {
		return name;
	}
	
	public float getPrice() {
		return price;
	}
	
	public float getQuantity() {
		return quantity;
	}

	@Override
	public float accept(ShoppingItemVisitor visitor) {
		return visitor.visit(this);
	}

}
