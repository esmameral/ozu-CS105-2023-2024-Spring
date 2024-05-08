package week12.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {

		// arrayListExample();
		// treeSetExample();
		// setExample();

		sortExamples();
		
		//comparatorComparableExamples();

	}

	public static void comparatorComparableExamples() {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(123, "pencil"));
		productList.add(new Product(27, "pen"));
		productList.add(new Product(500, "notebook"));
		productList.add(new Product(456, "book"));
		
		System.out.println("-------ArrayList&before sort---example----");
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i));
		}
		
		Collections.sort(productList,new ProductNameComparator());
		System.out.println("-------ArrayList&after sort by name---example----");

		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i));
		}
	}

	public static void sortExamples() {
		SortedSet<Product> products = new TreeSet<Product>(new ProductNameComparator());
		products.add(new Product(123, "pencil"));
		products.add(new Product(27, "pen"));
		products.add(new Product(27, "pen"));
		products.add(new Product(500, "notebook"));
		products.add(new Product(456, "book"));
		

		
		System.out.println("-------SortedSet&Comparable----example----");
		for (Product product : products) {
			System.out.println(product);
		}

		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(123, "pencil"));
		productList.add(new Product(27, "pen"));
		productList.add(new Product(500, "notebook"));
		productList.add(new Product(456, "book"));
		System.out.println("-------ArrayList%----example----");
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i));
		}
		
		Collections.sort(productList);
		System.out.println("-------ArrayList-after calling Collections.sort---");
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(productList.get(i));
		}
	}

	public static void treeSetExample() {
		SortedSet<String> names = new TreeSet<String>();
		names.add("zehra");
		names.add("ayse");
		names.add("hasan");
		names.add("kerem");
		for (String aName : names) {
			System.out.println(aName);

		}
	}

	public static void setExample() {
		Set<String> names = new HashSet<String>();
		names.add("Ali");
		names.add("ayse");
		names.add("zeki");
		names.add("zeki");
		for (String aName : names) {
			System.out.println(aName);

		}
	}

	public static void arrayListExample() {
		List<String> names = new ArrayList<String>();
		names.add("Ali");
		names.add("ayse");
		names.add("ayse");
		names.add("Ali");
		System.out.println(names.size());
		names.set(1, "hasan");
		names.add(0, "zeki");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));

		}
	}

}
