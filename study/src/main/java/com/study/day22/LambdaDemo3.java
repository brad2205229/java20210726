package com.study.day22;

public class LambdaDemo3 {

	public static void main(String[] args) {
		BMI bmi = new BMI() {
			
			@Override
			public double calc(double h, double w) {
				double result = w / Math.pow(h/100, 2);
				return result;
			}
		};
		System.out.println(bmi.calc(170, 60));
		
		// Lambda
		BMI bmi2 = (h, w) -> w / Math.pow(h/100, 2);
		System.out.println(bmi2.calc(170, 60));
	}

}