package com.study.day05;

public class HelloBmi {

	public static void main(String[] args) {
		BMI b1 = new BMI("John", 170, 60);
		// 查看目前的屬性資料
		//System.out.println(b1.getName());
		//System.out.println(b1.getHeight());
		//System.out.println(b1.getWeight());
		//System.out.println(b1.getBmi());
		System.out.println(b1);
		//System.out.println(b1.toString());
	}

}
