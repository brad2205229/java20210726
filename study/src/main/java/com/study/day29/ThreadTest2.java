package com.study.day29;

public class ThreadTest2 {
	public static void main(String[] args) {
		// 龜兔賽跑
		Race turtle = new Race();
		Race rabbit = new Race();
		turtle.setName("烏龜");
		rabbit.setName("兔子");
		// 如何在大多數情況下讓烏龜贏得比賽
		turtle.setPriority(Thread.MAX_PRIORITY);
		rabbit.setPriority(Thread.MIN_PRIORITY);
		rabbit.start();
		turtle.start();
		
	}
	
}
