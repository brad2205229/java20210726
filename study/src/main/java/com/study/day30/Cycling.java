package com.study.day30;

// 自行車項目
// 執行續工作 (Runnable)
public class Cycling implements Runnable{

	@Override
	public void run() {
		// 要騎 1~1000
			String tName = Thread.currentThread().getName();
			for(int i=0;i<=1000;i++) {
				System.out.printf("%s 騎了 %d 公尺\n", tName, i);
			}
		
	}
	
}
