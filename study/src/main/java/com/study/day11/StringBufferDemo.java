package com.study.day11;

public class StringBufferDemo {
	public static void main(String[] args) {
		// StringBuilder (用於單工)
		// StringBuffer (用於多執行序)
		StringBuilder sb = new StringBuilder();
		sb.append("Hi").append("Java");
		System.out.println(sb);
		sb.delete(0, 2);
		System.out.println(sb);
		sb.insert(4, "8");
		System.out.println(sb);
		// String 與 StringBuilder 的比較
		String s1 = "Java";
		StringBuilder s2 = new StringBuilder("Java");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		// StringBuilder 必須要先轉成字串之後再與 String 比較
		System.out.println(s1.equals(s2.toString()));
	}
}
