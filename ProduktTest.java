package JavaMarkt;

public class ProduktTest {
	public static void main(String[] args) {
		Product p = new Product(null, 0);
		
		p.setPrice(10);
		p.setName("Mleko");
		
		System.out.println("Produkt: " + p);
		System.out.println("Produkt: " + p.getName() + " " + p.getPrice());
		
		System.out.println("Produkt: " + p);

		Product p2 = new Product("Jabłko", 2.5);
		
		System.out.println("Produkt: " + p2);
	}
}
