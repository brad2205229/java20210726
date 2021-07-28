package com.study.day10;

public class ArrayDemo {
	public static void main(String[] args) {
		int[]scores = {100, 80, 0, 90};
		// 將 0 分改成 70 分
		scores[2] = 70;
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		// scores 陣列長度
		System.out.println(scores.length);
		// 利用 for-loop 取得陣列元素內容
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		// 總分平均各是多少
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum = sum + scores[i];
			System.out.println(sum);
		}
		double avg = sum / scores.length;
		System.out.println(avg);
	}
}
