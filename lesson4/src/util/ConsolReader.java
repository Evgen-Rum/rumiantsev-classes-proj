package util;

import java.util.Scanner;

public class ConsolReader {
	public static int readIntFromConsole(int defaultValue) {
		System.out.println("Please enter whole number!");
		Scanner scan = new Scanner(System.in);
		int num;
		for (int i = 0; i < 3; i++) {
			if (scan.hasNextInt()) {
				num = scan.nextInt();
				return num;
			} else if (i < 2) {
				System.out.println("Incorrect value! Please re-enter!");
				scan.next();
			} else {
				num = defaultValue;
				return num;
			}
		}
		return defaultValue;
	}

	public static double readDoubleFromConsole(double defaultValue) {
		Scanner scan1 = new Scanner(System.in);
		double num;
		for (int i = 0; i < 3; i++) {
			if (scan1.hasNextDouble()) {
				num = scan1.nextDouble();
				return num;
			} else if (i < 2) {
				System.out.println("Incorrect value! Please re-enter!");
				scan1.next();
			} else {
				num = defaultValue;
				return num;
			}
		}
		return defaultValue;
	}
//public static String readStringFromConsol() {
//	Scanner scan = new Scanner(System.in);
//	String line;
//	for (int i = 0; i < 3; i++) {
//		if (scan.hasNextLine()) {
//			line
//		}
//	}
//}
}