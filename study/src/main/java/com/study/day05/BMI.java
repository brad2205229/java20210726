package com.study.day05;

// 封裝版BMI
public class BMI {
	private String name;
	private double height;
	private double weight;
	private double bmi;
	public BMI(String nameString, double height, double weight) {
		super();
		this.name = nameString;
		this.height = height;
		this.weight = weight;
		this.bmi = calcBmi();
	};
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
		// bmi 的資料要重新計算
		this.bmi = calcBmi();
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
		// bmi 的資料要重新計算
		this.bmi = calcBmi();
	}
	public double getBmi() {
		return bmi;
	}
	private double calcBmi() {
		return weight / Math.pow(height/100, 2);
	}
	@Override
	public String toString() {
		return "BMI [name=" + name + ", height=" + height + ", weight=" + weight + ", bmi=" + bmi + "]";
	}
	
}
