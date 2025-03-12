class numberpyramid {
    public static void main(String[] args) {
        for (int i = 1, num = 1; i <= 5; i++, num = num * 10 + 1)
            System.out.println(num * num);
    }
}
