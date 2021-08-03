package com.study.day16;

class Bar{
	Bar(){
		System.out.println("Bar...");
	}
	Bar(int x){
		System.out.println("Bar我也一定要執行" + x);
	}
}

class Foo extends Bar
{
	Foo() {
		// super() // 隱含 ssurer<>
		super(100);
		System.out.println("Foo我一定要執行...");
	}
	Foo(int x){
		this(); // 呼叫自己無帶參數的建構子, this. 一定要寫在第一行
		System.out.println("Foo..." + x);
	}
}
public class ConstructorDemo2 {

	public static void main(String[] args) {
		//Foo foo1 = new Foo();
		Foo foo2 = new Foo(100);
	}

}
