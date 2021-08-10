package com.study.day23;

import java.util.Arrays;

public class LambdaDemo3 {

	public static void main(String[] args) {
		String[] names = {"Jo", "Anita", "Vincent",  "Jean"};
		// 請算出名字長度 >= 5 的總和
		// {"Jo", "Anita", "Vincent",  "Jean"}
		// { 2, 5, 7, 4 }
		// { 5, 7 }
		// 12
		Arrays.stream(names)
			.mapToInt(name -> name.length())         // ToIntFunction / Function
			.filter(n -> n >= 5)             		 // IntPredicate  / Predicate
			.forEach(n -> System.out.println(n));	 // IntConsumer  /  Consumer
	}

}
