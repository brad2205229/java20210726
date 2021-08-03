package com.study.day11;

import java.util.Arrays;

public class MultiArrayJava8Demo5 {

	public static void main(String[] args) {
		int[][] scores = {{100, 90, 70}, {80, 70, 60}};
		Arrays.stream(scores).forEach(System.out::println);
		// 二維 {{100, 90, 70}, {80, 70, 60}}
		// 打平Flat
		// {100, 90, 70}一維陣陣列 -> Arrays.stream({100, 90, 70})一維陣陣列串流
		// 一維 {100, 90, 70, 80, 70, 60}
		Arrays.stream(scores)
			.flatMapToInt(score -> Arrays.stream(score))
			.forEach(System.out::println);
		// 計算總分
		int sum = Arrays.stream(scores)
				.flatMapToInt(score -> Arrays.stream(score))
				.sum();
		System.out.printf("sum=%d\n", sum);
	}

}
