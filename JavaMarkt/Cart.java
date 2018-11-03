package JavaMarkt;

import java.util.*;

public class Cart {
	List<CartItem> items = new ArrayList<>();
	
	double promotionSumOfProducts = 0;
	
	public double totalPriceOfProducts(){
		double sum = 0;
		for(CartItem it : items)
			sum += it.getCurrentPrice();
		return sum;
	}
	public double totalPriceOfDiscountedProducts(){
		double sum = 0;
		for(CartItem it : items)
			sum += it.getCurrentPrice();
		return sum;
	}
	public List<CartItem> getItems() {
		return items;
	}
	
	public Cart addProduct(Product p) {
		items.add(new CartItem(p));
		promotionSumOfProducts += p.getPrice(); 
		return this;
	}

	public Cart removeProduct(Product p) {
		items.remove(new CartItem(p));
		promotionSumOfProducts -= p.getPrice(); 
		return this;
	}
	
	
	@Override
	public String toString() {
		return "Cart(\nitems=" + items + "\ntotal price=" + promotionSumOfProducts + "\n)";
	}

}
