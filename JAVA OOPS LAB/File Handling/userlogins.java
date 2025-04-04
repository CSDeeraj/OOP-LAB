import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class userlogins {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter '1' to login or '2' to view login history:");
		int choice = scanner.nextInt();
		scanner.nextLine();

		if (choice == 1) {
			System.out.println("enter username:");
			String username = scanner.nextLine();
			
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			String timestamp = now.format(formatter);
			
			try {
				FileWriter writer = new FileWriter("loginhistory.txt", true);
				writer.write("user: " + username + " logged in at: " + timestamp + "\n");
				writer.close();
				System.out.println("login recorded successfully.");
			} catch (IOException e) {
				System.out.println("error: unable to save login details.");
			}
		} else if (choice == 2) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader("loginhistory.txt"));
				String line;
				System.out.println("login history:");
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				reader.close();
			} catch (IOException e) {
				System.out.println("error: unable to read login history.");
			}
		} else {
			System.out.println("invalid choice.");
		}

		scanner.close();
	}
}
