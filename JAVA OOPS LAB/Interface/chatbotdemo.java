import java.util.Scanner;

interface chatbot {
	String greet();
	String respond(String message);
	String farewell();
}

class friendlybot implements chatbot {
	public String greet() {
		return "hello! nice to meet you!";
	}
	public String respond(String message) {
		return "that sounds great! tell me more!";
	}
	public String farewell() {
		return "goodbye! have a wonderful day!";
	}
}

class sarcasticbot implements chatbot {
	public String greet() {
		return "oh, wonderful, another conversation...";
	}
	public String respond(String message) {
		return "wow, what a unique and totally original thought!";
	}
	public String farewell() {
		return "finally, some peace and quiet. bye!";
	}
}

class seriousbot implements chatbot {
	public String greet() {
		return "greetings. state your request.";
	}
	public String respond(String message) {
		return "processing your input... please wait.";
	}
	public String farewell() {
		return "conversation ended. have a good day.";
	}
}

class chatbotdemo {
	static chatbot getchatbot(String choice) {
		if (choice.equals("friendly")) return new friendlybot();
		if (choice.equals("sarcastic")) return new sarcasticbot();
		if (choice.equals("serious")) return new seriousbot();
		return null;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("choose a chatbot: friendly, sarcastic, or serious");
		String choice = scanner.nextLine().toLowerCase();
		
		chatbot bot = getchatbot(choice);
		if (bot == null) {
			System.out.println("invalid choice. exiting.");
			scanner.close();
			return;
		}

		System.out.println(bot.greet());
		System.out.println("enter your message:");
		String message = scanner.nextLine();
		System.out.println(bot.respond(message));
		System.out.println(bot.farewell());

		scanner.close();
	}
}
