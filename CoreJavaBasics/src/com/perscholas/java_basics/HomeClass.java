package com.perscholas.java_basics;
import java.text.DecimalFormat;

public class HomeClass {

	public static void main(String[] args) {

		int num1 = 3;
		int num2 = 4;
		int sum = num1 + num2;

		System.out.println("the sum of two int values of  num1 and num2 = " + sum);

		double num3 = 3.4;
		double num4 = 4.2;
		double doubleSum = num3 + num4;

		System.out.println("the sum of double values of  num3 and num4 = " + doubleSum);

		int num5 = 3;
		double num6 = 4.22;
		double Sum3 = num5 + num6;

		System.out.println("the sum of double and int  values of  num5 and num6 = " + Sum3);

		int num7 = 8;
		int num8 = 3;

		// need to cast to double before we make any division work in the values
		double Sum4 = (double) num7 / (double) num8;

		System.out.println("  num7 / num8  after casting to double = " + Sum4);

		int x = 5;
		int y = 6;
		int q = y / x;

		System.out.println("the result of q without  casting = " + q);

		double q2 = (double) y / x;

		System.out.println("the result of q after casting = " + q2);

		final double PI = 3.14159265358979323846;
		int rad = 3;

		double area = PI * rad * rad;

		System.out.println("Area of a circle with radius " + rad + "= " + area);

		final double SALES_TAX = 1.15;
		int coffee = 5;
		int cappuccino = 3;
		int espresso = 6;

		int subTotal;
		double Total;

		int order = (3 * coffee) + (4 * cappuccino) + (2 * espresso);

		subTotal = order;

		Total = (double) subTotal * SALES_TAX;
		
		
		DecimalFormat df = new DecimalFormat("#.##"); 
		
		String ans = df.format(Total); 
		
		System.out.println("The total price of the sales  " + ans );
	}

}
