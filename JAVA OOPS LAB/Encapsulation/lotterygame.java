import java.util.Scanner;

class lottery {
	private int lotterynum;

	public lottery(int lotteryval) {
		this.lotterynum = lotteryval;
	}

	public int getlottery() {
		return lotterynum;
	}

	public void verifylottery(int guessednum) {
		if (guessednum == lotterynum) {
			System.out.println("congrats! you won 1 million dollars!");
		} else {
			System.out.println("sorry, you lost. the winning number was: " + getlottery());
		}
	}
}

public class lotterygame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lotteryvalue = (int) (Math.random() * 900000) + 100000;
		lottery lottery = new lottery(lotteryvalue);
		System.out.print("enter your 6-digit lottery guess: ");
		int userguess = scanner.nextInt();
		lottery.verifylottery(userguess);
		scanner.close();
	}
}
