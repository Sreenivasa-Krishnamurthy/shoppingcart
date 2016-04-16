package com.shopping.visitor;
import com.shopping.fruit.Fruit;

public interface ShoppingItemVisitor {
   float visit(Fruit fruit);
}
