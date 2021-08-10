package com.study.day25;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
	public static void main(String[] args) {
		Map<String, Integer> exams = new LinkedHashMap<>();
		exams.put("國文", 100);
		exams.put("英文", 90);
		exams.put("數學", 100);
		System.out.println(exams);
		
		// 將所有科目印出
		Set<String> keys = exams.keySet();
		System.out.println(keys);
		
		// 將所有分數印出
		Collection<Integer> scores = exams.values();
		System.out.println(scores);
		
		// 個別取出元素資料
		System.out.println(exams.get("數學"));
		
		// 個別取出資料
		exams.entrySet()
			.stream()
			.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
		// 透過 exams.entrySet() 計算總分
		int sum = exams.entrySet()
			.stream()
			.mapToInt(e -> e.getValue())
			.sum();
		System.out.println(sum);
		
		// 透過 exams.values() 計算總分
		sum = exams.values() 
		.stream()
		.mapToInt(score -> score.intValue())
		.sum();
		System.out.println(sum);
	}
}
