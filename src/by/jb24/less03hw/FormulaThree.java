package by.jb24.less03hw;

import java.util.Scanner;

public abstract class FormulaThree {

	public static void main(String[] args) {
		double x = 0;
		@SuppressWarnings("unused")
		double ret;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter x: ");
		if (sc.hasNextInt()) {
			x = sc.nextInt();
		}
		System.out.println("");

		compare(x);
		
		System.out.println("Done.");
	}

	public static void compare(double a) {
		double ret = 0;
		if (a > -3 & a <= 3) {
			System.out.println("compare returned: Out of scope");
		} else {

			if (a <= -3) {
				ret = fXFirst(a);
			}else {
				ret = fXSecond(a);
			}
			System.out.println("compare returned: " + ret);
		}
	}

	public static double fXFirst(double x) {
		//System.out.println("fXFirst returned: " + 9);
		return 9;
	}

	public static double fXSecond(double x) {
		double y;
		y = 1 / (x * x + 1);
		//System.out.println("fXSecond returned: " + y);
		return y;
	}
}
