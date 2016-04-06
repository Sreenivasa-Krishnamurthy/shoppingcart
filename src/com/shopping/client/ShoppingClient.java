package com.shopping.client;

import com.shopping.fruit.Fruit;
import com.shopping.item.ShoppingItem;
import com.shopping.visitor.ShoppingItemVisitor;
import com.shopping.visitor.ShoppingItemVisitorImpl;

/*  Shopping Client is the entry class that is used to calculate the total cost of all the items
 * in the fruit basket
 */

public class ShoppingClient {
	
	public static void main(String[] args ) {
		ShoppingItem[] items = new ShoppingItem[] { new Fruit("Bananas", 1, 5), 
													new Fruit("Oranges",2,10), 
													new Fruit("Apples", 0.1f,1),
													new Fruit("Lemons",1,5), 
													new Fruit("Peaches",3,10)};
		
		ShoppingItemVisitor visitor = new ShoppingItemVisitorImpl();
        float totalCost=0;
        for(ShoppingItem item : items){
            totalCost = totalCost+ item.accept(visitor);
        }
	        System.out.println("Total Cost = "+totalCost);
	}
}

