package com.study.day14.drinkstore;

public class Product {
	private String name;
	private int cost;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
		this.price = cost * 5;
	}
	public Product() {
		
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", cost=" + cost + ", price=" + price + "]";
	}
	
}
