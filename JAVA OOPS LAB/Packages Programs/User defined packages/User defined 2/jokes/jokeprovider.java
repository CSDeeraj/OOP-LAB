package jokes;
import java.util.Random;

public class jokeprovider {
	public static void main(String[] args) {
		String[] jokes = {
			"why did the computer catch a cold? because it left its windows open!",
			"why don’t programmers like nature? it has too many bugs.",
			"how do you comfort a javascript bug? you console it.",
			"Why did the Java student bring a broom to the lab? Because they wanted to clean up their code and fix all the bugs!"
		};
		Random random = new Random();
		System.out.println(jokes[random.nextInt(jokes.length)]);
	}
}
