import java.util.Scanner;
class swapnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        switch (1) {
            case 1 -> { a = a + b; b = a - b; a = a - b; }
        }
        System.out.println(a + " " + b);
    }
}

	
