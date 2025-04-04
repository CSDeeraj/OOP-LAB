import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class wordfrequency {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("document.txt");
			writer.write("the lion is known as the king of the jungle. the lion is a powerful predator, and the lion hunts in groups called prides. the lion's roar can be heard from miles away. lions live in the wild, and lions are also found in some reserves. lions are strong, and lions have sharp claws and strong teeth. lions are truly majestic animals.");
			writer.close();
		} catch (IOException e) {
			System.out.println("error: could not create file.");
			return;
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the word to search for:");
		String sw = scanner.nextLine().toLowerCase();
		scanner.close();

		int count = 0;

		try {
			File file = new File("document.txt");
			Scanner fileScanner = new Scanner(file);
			while (fileScanner.hasNext()) {
				String word = fileScanner.next().replaceAll("[^a-zA-Z]", "").toLowerCase();
				if (word.equals(sw)) {
					count++;
				}
			}
			fileScanner.close();
			System.out.println("the word \"" + sw + "\" appears " + count + " times in the document.");
		} catch (IOException e) {
			System.out.println("error: file not found.");
		}
	}
}
