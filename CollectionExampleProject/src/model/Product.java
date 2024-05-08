package model;

import java.util.Objects;

public class Product implements Comparable<Product>{
	private int id ;
	private String name;
	private double price;
	private String code;
	private int stockCount;
	public Product(int id, String name, double price, String code, int stockCount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.code = code;
		this.stockCount = stockCount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", code=" + code + ", stockCount="
				+ stockCount + "]";
	}
	@Override
	public int compareTo(Product o) {
		if (id < o.id)
			return -1;
		else if (id > o.id)
			return 1;
		else
			return 0;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}

}
