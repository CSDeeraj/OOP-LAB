package journalapp;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDateTime;

class diary {
	private String entry;
	private String timestamp;

	public void writeentry() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("write your diary entry: ");
		entry = scanner.nextLine();
		timestamp = LocalDateTime.now().toString();
		saveentry();
		System.out.println("entry saved on: " + timestamp);
	}

	private void saveentry() {
		try (FileWriter writer = new FileWriter("diary.txt", true)) {
			writer.write("entry on " + timestamp + ": " + entry + "\n");
		} catch (IOException e) {
			System.out.println("error saving entry.");
		}
	}

	public void showentries() {
		try (FileReader reader = new FileReader("diary.txt"); BufferedReader br = new BufferedReader(reader)) {
			String line;
			System.out.println("\nyour journal:");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("error reading the journal.");
		}
	}
}

public class diaryapp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		diary d = new diary();

		d.writeentry();

		System.out.print("\ndo you want to see all your entries? (yes/no): ");
		String choice = scanner.nextLine().toLowerCase();

		if (choice.equals("yes")) {
			d.showentries();
		} else {
			System.out.println("okay, journal not shown.");
		}

		scanner.close();
	}
}
