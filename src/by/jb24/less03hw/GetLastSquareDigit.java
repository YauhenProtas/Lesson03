package by.jb24.less03hw;

import java.util.Scanner;

public class GetLastSquareDigit {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int number = 0;
		int poslZifraKv;
		System.out.print("Введите число: ");
		if (sc.hasNextInt()) {
			number = sc.nextInt();
		}

		switch (lastDigit(number)) {
		case 0:
			poslZifraKv = 0;
			break;
		case 1:
			poslZifraKv = 1;
			break;
		case 2:
			poslZifraKv = 4;
			break;
		case 3:
			poslZifraKv = 9;
			break;
		case 4:
			poslZifraKv = 6;
			break;
		case 5:
			poslZifraKv = 5;
			break;
		case 6:
			poslZifraKv = 6;
			break;
		case 7:
			poslZifraKv = 9;
			break;
		case 8:
			poslZifraKv = 4;
			break;
		case 9:
			poslZifraKv = 1;
			break;
		default:
			consoleOutError("Houston, we have a problem!");
			return;
		}

		consoleOut("Квадрат последней цифры числа " + number + " равняется " + poslZifraKv);
	}

	public static int lastDigit(int value) {
		return value % 10;
	}

	public static void consoleOutError(String message) {
		System.out.println("!!! "+message);
	}

	public static void consoleOut(String message) {
		System.out.println(message);
	}

}
