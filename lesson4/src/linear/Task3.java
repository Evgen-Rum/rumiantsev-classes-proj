package linear;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] arg) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter seconds value!");
		int t;
		for (int i = 0; i < 3; i++) {
			if (scan.hasNextInt()) {
				t = scan.nextInt();
				int h = (t / 3600);
				int min = (t % 3600) / 60;
				int sec = t - ((h * 3600) + (min * 60));
				System.out.printf(h + "%d h. ", 0);
				System.out.printf(min + "%d min. ", 0);
				System.out.printf(sec + "%d sec. ", 0);
				break;
			} else if (i < 2) {
				System.out.println("Incorrect value. Please re-enter!");
				scan.next();
			} else {
				System.out.println("Incorrect value more then 3 times.");

			}
		}
	}
}
