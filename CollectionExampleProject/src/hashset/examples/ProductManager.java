package hashset.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import model.Product;

public class ProductManager {
	private HashSet<Product> products;

	public ProductManager() {
		products = new HashSet<Product>();
		products.add(new Product(1, "pen", 12, "P12DG", 100));
		products.add(new Product(15, "book", 24, "P452X", 32));
		products.add(new Product(22, "toy", 43, "PCFR12", 12));
		products.add(new Product(112, "eraser", 3, "P12CDFA", 45));
		products.add(new Product(45, "phone", 1200, "P34DF", 5));
		products.add(new Product(45, "tablet", 900, "P34XPU", 20));
	}

	public void sortProductsById() {
		System.out.println("-----------sortProductsById-----------");
		
		for (Product product : products) {
			System.out.println(product);
		}
	}

	

	
}
