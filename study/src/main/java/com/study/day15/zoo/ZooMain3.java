package com.study.day15.zoo;

public class ZooMain3 {

	public static void main(String[] args) {
		Animal a1 = (Animal)new Bird(); // OK
		//a1.move();
		Bird b2 = (Bird)new Bird(); // OK
		Ostrich o3 = (Ostrich)b2; // OK, 想成 Ostrich o3 = new Ostrich();
		Ostrich o4 = (Ostrich)a1; // Error, 想成 Ostrich o4 = new Bird();
		Bird    b5 = (Bird)new Animal(); // Error 想成 Bird b5 = new Animal();
	}

}
