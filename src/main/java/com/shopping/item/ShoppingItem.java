package com.shopping.item;

import java.math.BigDecimal;

import com.shopping.visitor.ShoppingItemVisitor;

public interface ShoppingItem {
	BigDecimal accept(ShoppingItemVisitor visitor);
}
