package com.study.day11;

import java.util.Random;
import java.util.Arrays;

public class Util {
	public static void addRandomData(int[][]m) {
		Random random = new Random();
		for(int i=0;i<m.length;i++) {
			for(int k=0;k<m[i].length;k++) {
				m[i][k] = random.nextInt(101);
				System.out.printf("m[%d][%d] = %d\n", i, k, m[i][k]);
			}
		}
	}
	public static void print(int[][]m) {
		for(int i=0;i<m.length;i++) {
			for(int k=0;k<m[i].length;k++) {
				System.out.printf("m[%d][%d] = %d\n", i, k, m[i][k]);
			}
		}
	}
	public static void print2(int[][]m) {
		for(int i=0;i<m.length;i++) {
			System.out.println(Arrays.toString(m[i]));
		}
	}
	
}
