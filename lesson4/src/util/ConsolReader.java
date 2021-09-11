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
}
