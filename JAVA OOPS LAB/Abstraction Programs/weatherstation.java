import java.util.Random;
import java.util.Scanner;

abstract class forecaster {
	abstract String predict(String day);
}

class sunnyforecaster extends forecaster {
	public String predict(String day) {
		int temp = new Random().nextInt(10) + 25;
		return day + " will be sunny with a temperature of " + temp + "°c";
	}
}

class rainyforecaster extends forecaster {
	public String predict(String day) {
		int rainchance = new Random().nextInt(40) + 60;
		return day + " may have rain showers with " + rainchance + "% chance of rain";
	}
}

class windyforecaster extends forecaster {
	public String predict(String day) {
		int windspeed = new Random().nextInt(20) + 10;
		return day + " will be windy with speeds up to " + windspeed + " km/h";
	}
}

public class weatherstation {
	static void forecast(forecaster f, String day) {
		System.out.println(f.predict(day));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a day for the weather forecast:");
		String day = scanner.nextLine();
		scanner.close();

		forecaster[] forecasts = {new sunnyforecaster(), new rainyforecaster(), new windyforecaster()};
		for (forecaster f : forecasts) forecast(f, day);
	}
}
