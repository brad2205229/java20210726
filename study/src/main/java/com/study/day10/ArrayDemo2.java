package com.study.day10;

import java.util.Arrays;
import java.lang.reflect.Array;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] scores = {100, 80, 70, 90};
		// 利用 Util 求出總分與平均
		int sum = Util.getSum(scores);
		double avg = Util.getAvg(scores);
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(Arrays.toString(scores));
		// 最高分與最低分 ?
		int max = 0;
		for(int i=0;i<scores.length;i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.printf("max: %d\n", max);
		int min = 100;
		for(int i=0;i<scores.length;i++) {
			if(scores[i] < min) {
				min = scores[i];
			}
		}
		System.out.printf("min: %d\n", min);
		// 最高分與最低分 ?
		System.out.println(Util.getMax(scores));
		System.out.println(Util.getMin(scores));
	}
}
