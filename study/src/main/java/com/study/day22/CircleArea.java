package com.study.day22;

// 園面積
public interface CircleArea {
	int AREA = 1;
	int VOLUMN = 2;
	// 計算(半徑 = r, type=1面積, 2體積)
	double calc(double r, int type);
}
