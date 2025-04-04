import java.util.Scanner;

class gadget {
	String assemble(String... components) {
		if (components.length < 3) return "At least 3 components are necessary.";

		boolean hascircuit = false, hasbattery = false, hassensor = false, hasmotor = false;
		boolean hasaiunit = false, haswheels = false, hasframe = false;

		for (String component : components) {
			component = component.toLowerCase();
			if (component.equals("circuit")) hascircuit = true;
			else if (component.equals("battery")) hasbattery = true;
			else if (component.equals("sensor")) hassensor = true;
			else if (component.equals("motor")) hasmotor = true;
			else if (component.equals("aiunit")) hasaiunit = true;
			else if (component.equals("wheels")) haswheels = true;
			else if (component.equals("frame")) hasframe = true;
		}

		if (hascircuit && hasbattery && hasframe) return "Assembling a basic electronic system.";
		if (hascircuit && hasbattery && hassensor) return "Assembling a smart sensor module.";
		if (hascircuit && hasbattery && hasmotor && hasframe) return "Assembling a simple robot.";
		if (hascircuit && hasbattery && hasmotor && haswheels && hasframe) return "Assembling a mobile robot.";
		if (hascircuit && hasbattery && hasmotor && hasaiunit && hasframe) return "Assembling an autonomous robot.";
		if (hascircuit && hasbattery && hasmotor && haswheels && hasaiunit && hasframe) return "Assembling an AI-powered mobile robot.";

		return "Invalid component combination.";
	}
}

class specializedgadget extends gadget {
	String assemble(String gadget, boolean upgrade) {
		return upgrade ? "Assembling an upgraded " + gadget + "." : "Assembling a standard " + gadget + ".";
	}
}

public class gadgetbuilder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter components separated by spaces, the available components are circuit, battery, sensor, ai unit, motor, wheels and frame: ");
		String input = scanner.nextLine();
		String[] components = input.split(" ");

		gadget g = new gadget();
		String result = g.assemble(components);
		System.out.println(result);

		if (!result.contains("Invalid") && !result.contains("At least")) {
			System.out.print("Do you want to upgrade it? (yes/no): ");
			String choice = scanner.next();
			boolean upgrade = choice.equalsIgnoreCase("yes");

			specializedgadget sg = new specializedgadget();
			System.out.println(sg.assemble(result.substring(11), upgrade));
		}
	}
}
