package linear;

import java.util.Scanner;

import util.ConsolReader;

public class Task4 extends ConsolReader {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a: ");
		int a = readIntFromConsole(2);
		System.out.println("Please enter b: ");
		int b = readIntFromConsole(3);
		System.out.println("Please enter c: ");
		int c = readIntFromConsole(4);
		if (a > 0) {
			double d = (b * b) + (4 * a * c);
			double e = Math.pow(a, 3) * c + Math.pow(b, -2);
			double result = ((b + Math.sqrt(d)) / 2 * a) - e;
			System.out.println(result);
		} else {
			System.out.println("Incorrect value is found!");
		}
	}
}
