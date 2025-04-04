import java.util.Scanner;
class numreverse {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        System.out.println(rev);
    }
}

	
