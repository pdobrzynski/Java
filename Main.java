package JavaMarkt;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Cart cart = new Cart();

		cart.addProduct(new Product("Kartofle", 200)).addProduct(new Product("Gazeta", 100));
				

		System.out.println("-1-\n" + cart);

	}
}
