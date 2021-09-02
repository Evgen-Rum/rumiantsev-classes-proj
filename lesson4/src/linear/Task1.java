package linear;
import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double a;
	double b;
	double c;
	System.out.println("Please enter a, b, c, an double number!");
	for (int i = 0; i < 3; i++) {
		double result; 
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			result = ((a - 3) * b / 2) + c;
			System.out.println(result);
			break;
		} else {
			System.out.println("Couldn't read entered data. Please re-enter!");
			sc.next();
		}
	}
	
}
}