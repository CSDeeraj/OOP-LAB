import java.util.Scanner;
import java.util.Random;

interface game {
	void start();
	void play();
	void end();
}

class chess implements game {
	Random rand = new Random();
	public void start() {
		System.out.println("chess starts. white moves first.");
	}
	public void play() {
		System.out.println("you move. opponent thinking...");
		System.out.println(rand.nextBoolean() ? "opponent blunders!" : "opponent plays strong.");
	}
	public void end() {
		System.out.println(rand.nextBoolean() ? "you win! checkmate!" : "you lose! try again.");
	}
}

class football implements game {
	Random rand = new Random();
	public void start() {
		System.out.println("match begins. kickoff!");
	}
	public void play() {
		System.out.println("shoot or pass? (s/p)");
		Scanner s = new Scanner(System.in);
		String choice = s.nextLine().toLowerCase();
		System.out.println(choice.equals("s") ? (rand.nextBoolean() ? "goal!!!" : "missed!") : "you passed the ball.");
	}
	public void end() {
		System.out.println(rand.nextBoolean() ? "your team wins!" : "your team loses.");
	}
}

class racing implements game {
	Random rand = new Random();
	public void start() {
		System.out.println("cars ready. lights red...");
		System.out.println("green light! go!");
	}
	public void play() {
		System.out.println("speed up or slow down? (u/d)");
		Scanner s = new Scanner(System.in);
		String choice = s.nextLine().toLowerCase();
		System.out.println(choice.equals("u") ? "you speed up!" : "you slow down.");
	}
	public void end() {
		System.out.println(rand.nextBoolean() ? "you win the race!" : "you lose. try again.");
	}
}

class gamesess {
	static game getgame(String choice) {
		if (choice.equals("c")) return new chess();
		if (choice.equals("f")) return new football();
		if (choice.equals("r")) return new racing();
		return null;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("choose a game: c (chess), f (football), r (racing)");
		String choice = s.nextLine().toLowerCase();
		
		game selected = getgame(choice);
		if (selected == null) {
			System.out.println("not an option.");
			s.close();
			return;
		}

		System.out.println("action? (start, play, end)");
		String action = s.nextLine().toLowerCase();

		switch(action) {
			case "start": selected.start(); break;
			case "play": selected.play(); break;
			case "end": selected.end(); break;
			default: System.out.println("invalid.");
		}

		s.close();
	}
}
