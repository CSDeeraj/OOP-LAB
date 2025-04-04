import java.util.Scanner;

public class dividebyzero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("enter the numerator:");
			int numerator = scanner.nextInt();
			System.out.println("enter the denominator:");
			int denominator = scanner.nextInt();
			if (denominator == 0) {
				throw new ArithmeticException("denominator cannot be zero");
			}
			double result = numerator / denominator;
			System.out.println("the result of division: " + result);
		} catch (ArithmeticException e) {
			System.out.println("error: " + e.getMessage());
		} finally {
			System.out.println("division attempt finished");
			scanner.close();
		}
	}
}