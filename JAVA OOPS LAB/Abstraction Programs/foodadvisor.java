import java.util.Random;
import java.util.Scanner;

abstract class mealplanner {
	abstract String recommend();
}

class veganplanner extends mealplanner {
	public String recommend() {
		String[] meals = {
			"quinoa salad with chickpeas",
			"tofu stir fry with brown rice",
			"lentil soup and whole grain bread"
		};
		return "vegan meal: " + meals[new Random().nextInt(meals.length)];
	}
}

class ketoplanner extends mealplanner {
	public String recommend() {
		String[] meals = {
			"grilled chicken with avocado",
			"bacon and eggs with cheese",
			"zucchini noodles with pesto"
		};
		return "keto meal: " + meals[new Random().nextInt(meals.length)];
	}
}

class balancedplanner extends mealplanner {
	public String recommend() {
		String[] meals = {
			"grilled salmon with rice and veggies",
			"chicken wrap with hummus and salad",
			"spaghetti with tomato sauce and fruit salad"
		};
		return "balanced meal: " + meals[new Random().nextInt(meals.length)];
	}
}

public class foodadvisor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("choose your diet type: vegan, keto, balanced");
		String diet = scanner.nextLine().toLowerCase();
		scanner.close();

		mealplanner planner;
		if (diet.equals("vegan")) planner = new veganplanner();
		else if (diet.equals("keto")) planner = new ketoplanner();
		else if (diet.equals("balanced")) planner = new balancedplanner();
		else {
			System.out.println("unknown diet type");
			return;
		}

		System.out.println(planner.recommend());
	}
}
