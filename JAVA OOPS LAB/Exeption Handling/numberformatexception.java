import java.util.Scanner;

public class numberformatexception {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number to calculate its square:");
		try {
			String userInput = scanner.nextLine();
			int num = Integer.parseInt(userInput);
			System.out.println("the square of the number is: " + (num * num));
		} catch (NumberFormatException e) {
			System.out.println("error: invalid number format. please enter a valid integer.");
		} finally {
			System.out.println("input processing finished.");
			scanner.close();
		}
	}
}
