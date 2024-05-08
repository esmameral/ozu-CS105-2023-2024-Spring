package week12.collection;

import java.util.Objects;

public class Product implements Comparable<Product> {
	private int code;
	private String name;

	public Product(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", name=" + name + "]";
	}

	/**
	 * Compares this object with the specified object for order. Returns a negative
	 * integer, zero, or a positive integer as this object is less than, equal to,
	 * or greater than the specified object.
	 */

	@Override
	public int compareTo(Product other) {
		if (this.getCode() < other.getCode())
			return -1;
		else if (this.getCode() > other.getCode())
			return 1;
		else
			return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return code == other.code;
	}
	
	

}
