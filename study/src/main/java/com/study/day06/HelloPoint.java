package com.study.day06;

public class HelloPoint {
	public static void main(String[] args) {
		// 開根號
		System.out.println(Math.sqrt(9));
		// 假設a點(10,20)  b點(-15,50)
		// 求ab線段的距離
		// 提示建立PointDistance.java + 組合Point
		Point p1 = new Point(10, 20);
		Point p2 = new Point(-15, 50);
		PointDistance pointDistance = new PointDistance(p1, p2);
		System.out.println(pointDistance.getDistance());
		System.out.println(pointDistance);
	}
}
