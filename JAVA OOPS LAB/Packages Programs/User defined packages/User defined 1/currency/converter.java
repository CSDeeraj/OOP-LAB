package currency;
import java.util.Scanner;

public class converter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter amount in usd:");
		double usd = scanner.nextDouble();
		double inr = usd * 82.50;
		double eur = usd * 0.91;
		double gbp = usd * 0.78;
		System.out.println("amount in inr: " + inr);
		System.out.println("amount in eur: " + eur);
		System.out.println("amount in gbp: " + gbp);
		scanner.close();
	}
}
