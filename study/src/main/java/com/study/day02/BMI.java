package com.study.day02;

// 設計一個BMI類別物件
// 需求:存放人名 身高 體重  <--屬性
//     計算BMI值        <--方法
public class BMI {
	String name;
	double height;
	double weight;
	// 取得bmi計算結果(計算結果也就是回傳值是double)
	double getBmiValue() {
		double bmi = weight / Math.pow(height/100, 2);
		// 回傳(return)bmi結果
		return bmi;
	}
}
