package by.jb24.less03hw;

import java.util.Scanner;

public class DaysCount {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int year = 0, month = 0, col_day = 0;
		System.out.print("Enter YEAR: ");
		if (sc.hasNextInt()) {
			year = sc.nextInt();
		}
		System.out.print("Enter MONTH: ");
		if (sc.hasNextInt()) {
			month = sc.nextInt();
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				col_day = 31;
				break;
			case 2:
				col_day = daysInFebruary(year);
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				col_day = 30;
				break;
			}
			consoleOut("Days count = " + col_day);
		}
	}

	public static int daysInFebruary(int year) {
		if (year % 4 == 0) {
			return 29;
		} else {
			return 28;
		}
	}
	
	public static void consoleOut(String message) {
		System.out.println(message);
	}
	
	
	
}
