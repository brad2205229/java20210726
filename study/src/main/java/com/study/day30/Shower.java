package com.study.day30;

class Father extends Thread{
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸準備洗澡");
		System.out.println("爸爸發現沒瓦斯");
		System.out.println("爸爸打電話請瓦斯工人送瓦斯");
		Worker worker = new Worker();
		worker.start();
		try {
			worker.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("爸爸開始洗澡");
		System.out.println("爸爸洗完澡了");
	}
}
class Worker extends Thread{
	public void run() {
		System.out.println("瓦斯工人準備送瓦斯");
		for(int i=1;i<=5;i++) {
			System.out.printf("%d 秒鐘\n", i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("發生意外");
			}
		}
		System.out.println("瓦斯工人將瓦斯送到家");
	}
}
public class Shower {

	public static void main(String[] args) {
		Father father = new Father();
		father.start();

	}

}
