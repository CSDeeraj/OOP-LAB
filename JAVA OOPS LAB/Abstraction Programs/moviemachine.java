import java.util.Random;
import java.util.Scanner;

abstract class recommender {
	abstract String suggest();
}

class actionrecommender extends recommender {
	public String suggest() {
		String[] movies = {"mad max", "john wick", "gladiator"};
		return "watch this action movie: " + movies[new Random().nextInt(movies.length)];
	}
}

class comedymovierecommender extends recommender {
	public String suggest() {
		String[] movies = {"the mask", "superbad", "step brothers"};
		return "watch this comedy movie: " + movies[new Random().nextInt(movies.length)];
	}
}

class scifirecommender extends recommender {
	public String suggest() {
		String[] movies = {"inception", "interstellar", "the matrix"};
		return "watch this sci-fi movie: " + movies[new Random().nextInt(movies.length)];
	}
}

public class moviemachine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("choose a genre: action, comedy, sci-fi");
		String genre = scanner.nextLine().toLowerCase();
		scanner.close();

		recommender rec;
		if (genre.equals("action")) rec = new actionrecommender();
		else if (genre.equals("comedy")) rec = new comedymovierecommender();
		else if (genre.equals("sci-fi")) rec = new scifirecommender();
		else {
			System.out.println("unknown genre");
			return;
		}

		System.out.println(rec.suggest());
	}
}
