package com.shopping.fruit;

import java.math.BigDecimal;

import com.shopping.item.ShoppingItem;
import com.shopping.visitor.ShoppingItemVisitor;

/* Represents the fruit object.
 * Visitor design pattern is used to calculate
 * the cost of each item. Price and Quantity
 * cannot be zero or negative.
 */

public class Fruit implements ShoppingItem{
	private final String name;
	private final BigDecimal price;
	private final BigDecimal quantity;
	
	public Fruit(String name, BigDecimal price, BigDecimal quantity) {
		
		if ( price.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Price cannot be negative or zero");
		}
		
		if (quantity.compareTo(BigDecimal.ZERO) <= 0) {
			throw new IllegalArgumentException("Quantity cannot be negative or zero");
		}
		
		this.name = name;
		this.price = price;
		this.quantity = quantity;
				
	}
	
	public String getName() {
		return name;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	public BigDecimal getQuantity() {
		return quantity;
	}

	@Override
	public BigDecimal accept(ShoppingItemVisitor visitor) {
		return visitor.visit(this);
	}

}
