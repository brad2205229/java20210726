package com.study.day01;

public class HelloBMI {

	public static void main(String[] args) {
		String name = "John";
		double h = 170;
		double w = 60;
		double bmi = w / Math.pow(h/100, 2);
		System.out.printf("%s bmi = %.2f\n", name, bmi);
	}

}
