package com.study.day24;


import java.util.LinkedHashSet;
import java.util.Set;

import com.study.day11.Exam;

public class EqualsBookDemo {

	public static void main(String[] args) {
		Book b1 = new Book("Java", "Vincent", 200);
		Book b2 = new Book("Python", "Anita", 250);
		Book b3 = new Book("Java", "Vincent", 200);
		Book b4 = new Book("C#", "Helen", 150);
		Set<Book> books = new LinkedHashSet<>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);
		System.out.println(books);
		System.out.println(books.size());
		int sum = books.stream()
			.mapToInt(Book::getPrice)
			.sum();
		System.out.println(sum);
	}

}
