package mathoperations;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number:");
		double num1 = scanner.nextDouble();
		System.out.println("enter second number:");
		double num2 = scanner.nextDouble();
		System.out.println("sum: " + (num1 + num2));
		System.out.println("difference: " + (num1 - num2));
		System.out.println("product: " + (num1 * num2));
		System.out.println("quotient: " + (num1 / num2));
		scanner.close();
	}
}
