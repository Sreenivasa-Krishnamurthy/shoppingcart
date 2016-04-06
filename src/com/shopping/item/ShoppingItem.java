package com.shopping.item;

import com.shopping.visitor.ShoppingItemVisitor;

public interface ShoppingItem {
	float accept(ShoppingItemVisitor visitor);
}
