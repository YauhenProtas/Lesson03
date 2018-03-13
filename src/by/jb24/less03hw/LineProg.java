package by.jb24.less03hw;

import java.util.Scanner;

public class LineProg {

	public static void main(String[] args) {
		int number = 0;
		System.out.print("Введите число: ");

		number = getInput();
		
		if (calcOdd(number)) {
			consoleOut("В числе нет четных цифр.");	
		}else {
			consoleOut("В числе есть четная цифра.");
		}
		
	}

	public static boolean calcOdd(int value) {
		int dgt = 0;
		while (value != 0) {
			dgt = value % 10;
			value = value / 10;
			if (dgt % 2 == 0) {
				return (false);
			}
		}
		return (true);
	}

	public static int getInput() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int value = 0;
		if (sc.hasNextInt())
			value = sc.nextInt();
		return value;
	}

	public static void consoleOut(String message) {
		System.out.println(message);
	}
}
