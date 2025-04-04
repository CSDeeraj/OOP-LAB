package randomgenerator;
import java.util.Random;

public class randomnumber {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("random number between 1 and 100: " + (random.nextInt(100) + 1));
	}
}
