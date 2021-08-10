package com.study.day24;

enum USCoin{
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	private int value;
	USCoin(int value){
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}
public class EnumDemo2 {
	public static void main(String[] args) {
		USCoin penny = USCoin.PENNY;
		System.out.println(penny.getValue());
		
		USCoin nickle = USCoin.NICKLE;
		System.out.println(nickle.getValue());
		
		USCoin dime = USCoin.DIME;
		System.out.println(dime.getValue());
		
		USCoin quarter = USCoin.QUARTER;
		System.out.println(quarter.getValue());
	}
}
