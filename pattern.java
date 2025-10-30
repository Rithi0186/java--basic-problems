class Main {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * (n - i) + 1; j++) {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
