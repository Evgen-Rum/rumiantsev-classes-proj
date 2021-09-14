package linear;

import java.util.Scanner;

import util.ConsolReader;

public class Task5 extends ConsolReader {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter x, y!");
		for (int i = 0; i < 3; i++) {
			double xValue = readDoubleFromConsole(2);
			double yValue = readDoubleFromConsole(3);
			if (xValue > 0 && yValue > 0) {
				
				double up = Math.sin(Math.toDegrees(xValue)) + Math.cos(Math.toDegrees(yValue));
				double down = Math.cos(Math.toDegrees(xValue)) - Math.sin(Math.toDegrees(yValue));
				double result = up / down * Math.tan(Math.toDegrees(xValue) * Math.toDegrees(yValue));
				System.out.println(result);
				break;
			} else {
				System.out.println("Incorrect value!");
			}
		}
	}
}
