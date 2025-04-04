import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class filenotfound {
	public static void main(String[] args) {
		File file = new File("nonexistentfile.txt");
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("error: file 'nonexistentfile.txt' not found. please check the file path.");
		} finally {
			System.out.println("file read attempt finished.");
		}
	}
}
