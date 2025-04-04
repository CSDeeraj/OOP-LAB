import java.io.*;
import java.util.*;

public class notemanager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of lines to write:");
		int numLines = scanner.nextInt();
		scanner.nextLine();

		try {
			FileWriter writer = new FileWriter("notes.txt");
			System.out.println("enter " + numLines + " lines:");
			for (int i = 0; i < numLines; i++) {
				writer.write(scanner.nextLine() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("error: could not write to file.");
			scanner.close();
			return;
		}

		System.out.println("enter the line to delete:");
		String delline = scanner.nextLine().toLowerCase();

		try {
			File file = new File("notes.txt");
			Scanner fileScanner = new Scanner(file);
			List<String> lines = new ArrayList<>();

			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				if (!simplify(line).contains(simplify(delline))) {
					lines.add(line);
				}
			}
			fileScanner.close();

			FileWriter writer = new FileWriter("notes.txt");
			for (String line : lines) {
				writer.write(line + "\n");
			}
			writer.close();
			System.out.println("updated file saved.");
		} catch (IOException e) {
			System.out.println("error: file not found.");
			scanner.close();
			return;
		}

		System.out.println("do you want to see the file contents? (yes/no)");
		String choice = scanner.nextLine().toLowerCase();
		if (choice.equals("yes")) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
				String line;
				System.out.println("file contents:");
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				reader.close();
			} catch (IOException e) {
				System.out.println("error reading the file.");
			}
		} else {
			System.out.println("okay, not showing the file.");
		}

		scanner.close();
	}

	private static String simplify(String text) {
		return text.replaceAll("(ing|ed|es|s)$", "").toLowerCase();
	}
}
