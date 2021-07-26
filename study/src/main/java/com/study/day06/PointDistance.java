package com.study.day06;

import java.util.PrimitiveIterator;

// 二點間的距離
public class PointDistance {
	private double distance;
	private Point p1;
	private Point p2;
	
	public PointDistance(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		calcDistance();
	}
	// 計算距離的方法
	private void calcDistance() {
		double d = 0;
		double xx =  Math.pow(p1.getX()- p2.getX(), 2);
		double yy = Math.pow(p1.getY()- p2.getY(), 2);
		d = Math.sqrt(xx + yy);
		this.distance = d;
	}

	public double getDistance() {
		return distance;
	}
	@Override
	public String toString() {
		return "PointDistance [distance=" + distance + ", p1=" + p1 + ", p2=" + p2 + "]";
	}
	
}
