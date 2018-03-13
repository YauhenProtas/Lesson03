package by.jb24.less03hw;

import java.util.Scanner;

public class MinMaxString {
	public static void main(String[] args) {
		int n = 10;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String max = "", min = "", str = "";
		for (int i = 0; i < n; i++) {
			System.out.print("> ");

			if (sc.hasNextLine()) {
				str = sc.nextLine();
				if (i == 0) {
					min = str;
				}
				if (str.length() > max.length()) {
					max = str;
				} else if (str.length() < min.length()) {
					min = str;
				}
			}
		}

		consoleOut(max,min);
	}

	public static void consoleOut(String max, String min) {
		System.out.println("max string = " + max + "\nLength = " + max.length());
		System.out.println("min string = " + min + "\nLength = " + min.length());
	}

}
