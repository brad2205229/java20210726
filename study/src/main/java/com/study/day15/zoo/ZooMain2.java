package com.study.day15.zoo;

import java.util.Arrays;

public class ZooMain2 {
	
	// 多型下轉型的問題
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Tiger();
		Animal a3 = new Fish();
		Animal a4 = new Bird();
		Animal a5 = new Ostrich();
		((Bird)a4).birth();
		((Bird)a5).birth();
		a4.move();
		a5.move();
		((Bird)a5).move();
		if(a5 instanceof Fish) {
			((Fish)a5).move();
		}
		Animal[] animals = {a1, a2, a3, a4, a5};
		// 請問共有幾隻腳
		int sum = Arrays.stream(animals)
		  .mapToInt(leg -> leg.getLegs())
		  //.peek(System.out::println)
		  .sum();
		 System.out.println(sum);
	}

}
