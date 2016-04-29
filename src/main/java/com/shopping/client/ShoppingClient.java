package com.shopping.client;

import java.math.BigDecimal;

import com.shopping.fruit.Fruit;
import com.shopping.item.ShoppingItem;
import com.shopping.visitor.ShoppingItemVisitor;
import com.shopping.visitor.ShoppingItemVisitorImpl;

/*  Shopping Client is the entry class that is used to calculate the total cost of all the items
 * in the fruit basket
 */

public class ShoppingClient {
	
	public static void main(String[] args ) {
		ShoppingItem[] items = new ShoppingItem[] { new Fruit("Bananas", new BigDecimal(1), new BigDecimal(5)), 
													new Fruit("Oranges",new BigDecimal(2),new BigDecimal(10)), 
													new Fruit("Apples", new BigDecimal("0.1"),new BigDecimal(1)),
													new Fruit("Lemons",new BigDecimal(1),new BigDecimal(5)), 
													new Fruit("Peaches",new BigDecimal(3),new BigDecimal(10))};
		
		ShoppingItemVisitor visitor = new ShoppingItemVisitorImpl();
        BigDecimal totalCost=new BigDecimal(0);
        for(ShoppingItem item : items){
            totalCost = totalCost.add(item.accept(visitor));
        }
	        System.out.println("Total Cost = "+totalCost);
	}
}

