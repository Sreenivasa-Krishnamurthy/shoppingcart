package com.shopping.visitor;
import java.math.BigDecimal;

import com.shopping.fruit.Fruit;

public interface ShoppingItemVisitor {
   BigDecimal visit(Fruit fruit);
}
