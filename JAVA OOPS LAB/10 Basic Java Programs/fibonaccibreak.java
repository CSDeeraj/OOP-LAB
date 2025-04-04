class fibonaccibreak {
    public static void main(String[] args) {
        int a = 0, b = 1;
        while (true) {
            System.out.print(a + " ");
            if (a > 100) break;
            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

	
