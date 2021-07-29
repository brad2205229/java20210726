package com.study.day11;

import java.awt.FocusTraversalPolicy;

public class MultiArrayDemo4 {

	public static void main(String[] args) {
		// 使用 for-in 迴圈來分析陣列
		int[] scores = {100, 90, 80};
		// for-loop
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i]);
		}
		// for-in
		for(int score : scores) {
			System.out.println(score);
		}
		// 使用 for-in 迴圈來分析多維陣列
		int[][] values = { {100, 90}, {80, 70, 60} };
		for(int[] val : values) {
			for(int v : val){
				System.out.println(v);
			}
		}
	}

}
