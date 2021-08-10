package com.study.day24;

class Outer{ 
	int x = 10; // Outer's物件變數
	static int sx = 100; // Outer's類別(static)變數/靜態變數
	
	class Inner{ // 一般內部類別
		void print() {
			System.out.println("Inner() -> print()");
			System.out.println(Outer.sx);
			System.out.println(Outer.this.sx);
			SInner.sprint();
		}
	}
	
	static class SInner{ // 靜態(static)內部類別 (沒有this指標)
		void print() {
			System.out.println("Inner() -> print()");
		}
		static void sprint() {
			System.out.println("Inner() -> (static)sprint()");
			System.out.println(Outer.sx);
			// System.out.println(Outer.this.sx);
		}
	}
}
public class InnerMain {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer().new Inner();
		inner.print();
		
		Outer.SInner sInner = new Outer.SInner();
		sInner.print();
		sInner.sprint();
	}
}
