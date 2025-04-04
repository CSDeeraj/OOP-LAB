import java.util.Scanner;
class Atmsystem {
    public static void main(String[] args) {
        int balance = 5000, pin = 1234;
        Scanner sc = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.print("Enter PIN: ");
            if (sc.nextInt() == pin) break;
            System.out.println("You Entered the Wrong Pin. Attempts left: " + (i - 1));
        }
        while (true) {
            System.out.print("1.Withdraw 2.Deposit 3.Exit: ");
            switch (sc.nextInt()) {
                case 1  { System.out.print("Amount: "); balance -= sc.nextInt(); }
                case 2 { System.out.print("Amount: "); balance += sc.nextInt(); }
                case 3  System.exit(0);
            }
            System.out.println("Balance: " + balance);
        }
    }
}


	
