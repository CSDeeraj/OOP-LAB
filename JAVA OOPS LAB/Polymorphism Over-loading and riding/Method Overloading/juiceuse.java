import java.util.Scanner;

class juice {
	String make(String... ingredients) {
		if (ingredients.length < 2) return "At least 2 ingredients are necessary.";
		boolean haswater = false, hassugar = false, hasmango = false, hasmilk = false, hasice = false;
		for (String ingredient : ingredients) {
			switch (ingredient.toLowerCase()) {
				case "water": haswater = true; break;
				case "sugar": hassugar = true; break;
				case "mango": hasmango = true; break;
				case "milk": hasmilk = true; break;
				case "ice": hasice = true; break;
			}
		}
		if (hasmilk && hasmango) return "Making a mango milkshake.";
		if (haswater && hassugar && !hasmango) return "Making syrup water.";
		if (haswater && hassugar && hasmango) return "Making mango juice.";
		if (haswater && hasmango && hasice && !hassugar) return "Making sweetless mango juice.";
		if (haswater && hasmango && !hassugar && !hasice) return "Making mango puree.";
		return "Invalid ingredient combination.";
	}
}

class specializedjuice extends juice {
	String make(String drink, boolean addice) {
		return addice ? "Making chilled " + drink + "." : "Making " + drink + ".";
	}
}

public class juiceuse {
	public static void main(String[] args) {
		Scanner u = new Scanner(System.in);
		System.out.print("Enter ingredients separated by spaces (e.g., water sugar mango): ");
		String input = u.nextLine();
		String[] ingredients = input.split(" ");
		juice j = new juice();
		String result = j.make(ingredients);
		System.out.println(result);
		if (!result.contains("Invalid") && !result.contains("At least")) {
			System.out.print("Do you want it chilled? (yes/no): ");
			String choice = u.next();
			boolean addice = choice.equalsIgnoreCase("yes");
			specializedjuice sj = new specializedjuice();
			System.out.println(sj.make(result.substring(8), addice));
		}
	}
}
