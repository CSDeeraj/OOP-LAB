import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class taskmanager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter '1' to add task or '2' to view task history:");
		int c = scanner.nextInt();
		scanner.nextLine();

		if (c == 1) {
			System.out.println("enter task description:");
			String task = scanner.nextLine();
			System.out.println("enter time to complete the task (e.g., 2:00 PM):");
			String time = scanner.nextLine();
			
			try {
				FileWriter writer = new FileWriter("taskhistory.txt", true);
				writer.write("task: " + task + " to be completed at: " + time + "\n");
				writer.close();
				System.out.println("task added successfully.");
			} catch (IOException e) {
				System.out.println("error: unable to save task details.");
			}
		} else if (c == 2) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader("taskhistory.txt"));
				String line;
				System.out.println("task history:");
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				reader.close();
			} catch (IOException e) {
				System.out.println("error: unable to read task history.");
			}
		} else {
			System.out.println("invalid choice.");
		}

		scanner.close();
	}
}
