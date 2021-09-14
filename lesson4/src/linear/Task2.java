package linear;

import java.util.Scanner;

import util.ConsolReader;

public class Task2 extends ConsolReader {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter double number");
		double num1;
		for (int i = 0; i < 3; i++) {
			if (sc.hasNextDouble()) {
				num1 = sc.nextDouble();
				double expr1 = (num1 * 1000) % 1000;
				double expr2 = (int) num1 / 1000.0;
				double result = expr1 + expr2;
				System.out.println(result);
				break;
			} else {
				System.out.println("Incorrect data! Please re-enter!");
				sc.next();
			}
		}
	}
}
