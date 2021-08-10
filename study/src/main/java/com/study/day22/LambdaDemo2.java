package com.study.day22;

public class LambdaDemo2 {

	public static void main(String[] args) {
		Score score = (int s) -> s >= 60;
		System.out.println(score.isPassOrFail(75));
		System.out.println(score.isPassOrFail(45));
	}
	

}
