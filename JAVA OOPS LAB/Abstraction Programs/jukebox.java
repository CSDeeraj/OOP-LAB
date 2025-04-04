import java.util.Random;
import java.util.Scanner;

abstract class musicplayer {
	abstract String play();
}

class rockplayer extends musicplayer {
	public String play() {
		String[] songs = {"thunderstruck", "bohemian rhapsody", "sweet child o' mine"};
		return "now playing: " + songs[new Random().nextInt(songs.length)] + " (rock)";
	}
}

class popplayer extends musicplayer {
	public String play() {
		String[] songs = {"blinding lights", "shake it off", "uptown funk"};
		return "now playing: " + songs[new Random().nextInt(songs.length)] + " (pop)";
	}
}

class jazzplayer extends musicplayer {
	public String play() {
		String[] songs = {"take five", "so what", "fever"};
		return "now playing: " + songs[new Random().nextInt(songs.length)] + " (jazz)";
	}
}

public class jukebox {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("choose a genre: rock, pop, jazz");
		String choice = scanner.nextLine().toLowerCase();
		scanner.close();

		musicplayer player;
		if (choice.equals("rock")) player = new rockplayer();
		else if (choice.equals("pop")) player = new popplayer();
		else if (choice.equals("jazz")) player = new jazzplayer();
		else {
			System.out.println("that is invalid genre.");
			return;
		}

		System.out.println(player.play());
	}
}
