import java.util.Scanner;

interface ins {
	void play();
	void tune();
	void stop();
}

class pi implements ins {
	public void play() {
		System.out.println("the piano plays a calm tune.");
	}
	public void tune() {
		System.out.println("tuning the piano.");
	}
	public void stop() {
		System.out.println("the piano stops.");
	}
}

class gu implements ins {
	public void play() {
		System.out.println("the guitar plays a nice rhythm.");
	}
	public void tune() {
		System.out.println("tightening the guitar.");
	}
	public void stop() {
		System.out.println("the guitar stops.");
	}
}

class dr implements ins {
	public void play() {
		System.out.println("the drums make a loud beat.");
	}
	public void tune() {
		System.out.println("adjusting the drums.");
	}
	public void stop() {
		System.out.println("the drums stop.");
	}
}

class musicsess {
	static ins getins(String choice) {
		if (choice.equals("p")) return new pi();
		if (choice.equals("g")) return new gu();
		if (choice.equals("d")) return new dr();
		return null;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("choose: p (piano), g (guitar), d (drums)");
		String choice = s.nextLine().toLowerCase();
		
		ins selected = getins(choice);
		if (selected == null) {
			System.out.println("not an option.");
			s.close();
			return;
		}

		System.out.println("action? (play, tune, stop)");
		String action = s.nextLine().toLowerCase();

		switch(action) {
			case "play": selected.play(); break;
			case "tune": selected.tune(); break;
			case "stop": selected.stop(); break;
			default: System.out.println("invalid.");
		}

		s.close();
	}
}
