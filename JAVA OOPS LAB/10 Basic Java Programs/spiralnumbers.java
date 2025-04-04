class spiralnumbers {
    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(num++ + " ");
            if (i == n - 1) {
                i = -1; n--;
                System.out.println();
            }
            if (n == 0) break;
        }
    }
}
