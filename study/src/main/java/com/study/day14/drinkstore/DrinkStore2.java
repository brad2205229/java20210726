package com.study.day14.drinkstore;

import java.util.LinkedHashSet;

public class DrinkStore2 {

	public static void main(String[] args) {
		Product redTea = new Product("紅茶", 5);
		Product milk = new Product("牛奶", 10);
		Product coffee = new Product("咖啡", 15);
		Product greenTea = new Product("綠茶", 6);
		Product cake = new Product("蛋糕", 20);
		Product eggTart = new Product("蛋塔", 28);
		
		Drink milkTea = new Drink("奶茶", 1);
		milkTea.addProduct(redTea).addProduct(milk);
		
		Drink latte = new Drink("拿鐵", 1);
		latte.addProduct(coffee).addProduct(milk);
		
		Drink blackCoffee = new Drink("黑咖啡", 1);
		blackCoffee.addProduct(coffee);
		
		Dessert angelCake = new Dessert("天使蛋糕", cake, 1);
		Dessert goldeggTart = new Dessert("金牌蛋塔", eggTart, 1);
		
		// 套餐
		// family 全家餐
		// 5 杯拿鐵 3 杯奶茶 6 個金牌蛋塔 4 個天使蛋糕
		// 打 8.8 折
		// 請建立 Combol 物件 family
		// 請問此套餐折扣後的價格
		latte.setAmount(5);
		milkTea.setAmount(3);
		goldeggTart.setAmount(6);
		angelCake.setAmount(4);
		
		LinkedHashSet<Drink> drinks = new LinkedHashSet<>();
		LinkedHashSet<Dessert> desserts = new LinkedHashSet<>();
		drinks.add(latte);
		drinks.add(milkTea);
		desserts.add(goldeggTart);
		desserts.add(angelCake);
		Combol familyCombol = new Combol(drinks, desserts, 0.88);
		
		// 請問此套餐折扣後的價格是多少
		int drinkTotalPrice = familyCombol.getDrinks().stream()
				.mapToInt(drink -> drink.getAmount() * 
								   drink.getProducts().stream().mapToInt(Product::getPrice).sum())
				.sum();
		int dessertTotalPrice = familyCombol.getDesserts().stream()
				.mapToInt(dessert -> dessert.getAmount()*
									 dessert.getProduct().getPrice())
				.sum();
		double totalPrice = (dessertTotalPrice + dessertTotalPrice) * familyCombol.getDiscount();
		System.out.println(totalPrice);
	}

}
