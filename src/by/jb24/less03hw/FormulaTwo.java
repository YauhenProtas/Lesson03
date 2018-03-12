package by.jb24.less03hw;

import java.util.Scanner;

public abstract class FormulaTwo {

	public static void main(String[] args) {
		double a = 0, b = 0, h = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a: ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}

		System.out.println("Please enter b: ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}

		System.out.println("Please enter h: ");
		if (sc.hasNextDouble()) {
			h = sc.nextDouble();
		}
		System.out.println("");
		System.out.println("\t|" + " x " + "\t|" + " Fx()              " + "\t|");
		enumerate(a, b, h);
	}

	public static double fX(double x) {
		double y;
		y = 2 * Math.tan(x / 2) + 1;
		return y;
	}

	public static void enumerate(double a, double b, double h) {
		for (double i = a; i < b; i = i + h) {

			System.out.println("\t|" + i + "\t|" + fX(i) + "\t|");

		}
	}

}
