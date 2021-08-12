package com.study.day30;

// 游泳項目
// 執行續工作 (Runnable)
public class Swimming implements Runnable{

	@Override
	public void run() {
		// 要游 1~1000
			String tName = Thread.currentThread().getName();
			for(int i=0;i<=1000;i++) {
				System.out.printf("%s 游了 %d 公尺\n", tName, i);
			}
		
	}
	
}
