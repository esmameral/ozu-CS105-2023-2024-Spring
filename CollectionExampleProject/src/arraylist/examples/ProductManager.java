package arraylist.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Product;

public class ProductManager {
	private List<Product> products;

	public ProductManager() {
		products = new ArrayList<Product>();
		products.add(new Product(1, "pen", 12, "P12DG", 100));
		products.add(new Product(15, "book", 24, "P452X", 32));
		products.add(new Product(22, "toy", 43, "PCFR12", 12));
		products.add(new Product(112, "eraser", 3, "P12CDFA", 45));
		products.add(new Product(45, "phone", 1200, "P34DF", 5));
		products.add(new Product(45, "tablet", 900, "P34XPU", 20));
	}

	public void sortProductsById() {
		System.out.println("-----------sortProductsById-----------");
		Collections.sort(products);
		for (Product product : products) {
			System.out.println(product);
		}
	}

	public void sortProductsByPrice() {
		System.out.println("-----------sortProductsByPrice-----------");
		Collections.sort(products,new ProductPriceComparator());
		for (Product product : products) {
			System.out.println(product);
		}
	}

	public void sortProductsByName() {
		System.out.println("-----------sortProductsByName-----------");
		Collections.sort(products,new ProductNameComparator());
		for (Product product : products) {
			System.out.println(product);
		}
	}
}
