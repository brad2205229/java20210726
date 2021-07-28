package com.study.day11;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		System.out.println(s1 == s2);
		s1 = s1.intern(); // 將s1 所指向的字串放入String Pool 中
		System.out.println(s1 == s2);
		String word = "she sell sea shell on the sea shore";
		System.out.println(word);
		word = word.trim(); // 去除左右空白
		System.out.println(word.length());
		System.out.println(word.contains("sea"));
	}
}
