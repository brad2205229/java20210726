package com.study.day11;

import java.util.Arrays;

public class MultiArrayDemo3 {
	public static void main(String[] args) {
		Exam e1 = new Exam("國文", 100);
		Exam e2 = new Exam("數學", 90);
		Exam e3 = new Exam("英文", 80);
		
		Exam e4 = new Exam("國文", 60);
		Exam e5 = new Exam("數學", 70);
		Exam e6 = new Exam("英文", 90);
		
		Exam[][] exams = {
				{e1, e2, e3}, {e4, e5, e6}
		};
		System.out.println(exams);
		System.out.println(exams[0][0]);
		System.out.println(exams[0]);
		// 求出國文 數學 英文的平均
		int c_sum = 0;
		int m_sum = 0;
		int e_sum = 0;
		for(int i=0;i<exams.length;i++) {
			for(int k=0;k<exams[i].length;k++) {
				Exam e = exams[i][k];
				switch(e.getName()) {
					case "國文":
						c_sum += e.getScore();
						break;
					case "數學":
						m_sum += e.getScore();
						break;
					case "英文":
						e_sum += e.getScore();
						break;
				}
			}
			
		}
		System.out.println(c_sum / exams.length);
		System.out.println(m_sum / exams.length);
		System.out.println(e_sum / exams.length);
	}
}
