package linear;

import java.util.Scanner;

import util.ConsolReader;

public class Task6 extends ConsolReader {
	public static void main(String[] args) {
		System.out.println("Please enter x, y: ");
		double y = readDoubleFromConsole(2);
		double x = readDoubleFromConsole(3);
		if (y <= 4 && y >= -3 && x <= 4 && x >= -4) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}
}
