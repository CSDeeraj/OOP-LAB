package mypackage;

import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

class game {
	private int number;
	private int tries;

	public game() {
		Random rand = new Random();
		number = rand.nextInt(10) + 1; 
		tries = 0;
	}

	public void play() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("guess a number (1-10): ");

		while (true) {
			int guess = scanner.nextInt();
			tries++;

			if (guess == number) {
				System.out.println("correct! you guessed in " + tries + " tries.");
				logresult(true);
				break;
			} else {
				System.out.println("wrong! try again.");
			}
		}
		scanner.close();
	}

	private void logresult(boolean won) {
		try {
			FileWriter writer = new FileWriter("game_log.txt", true);
			writer.write("game played on: " + LocalDateTime.now() + ", won: " + won + ", attempts: " + tries + "\n");
			writer.close();
		} catch (IOException e) {
			System.out.println("error writing to file.");
		}
	}
}

public class gamemain {
	public static void main(String[] args) {
		game g = new game();
		g.play();
	}
}
