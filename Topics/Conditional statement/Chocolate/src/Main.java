import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        boolean b = false;

        if (k > 0 && k <= n * m) {
            for (int i = 1; i < n + 1; i++) {
                if (i * m <= k && i * m % k == 0) {
                    b = true;
                }
            }

            for (int j = 1; j < m + 1; j++) {
                if (j * n <= k && n * j % k == 0) {
                    b = true;
                }
            }
        }
        if (b) {
            System.out.println("YES");
         }
        else {
            System.out.println("NO");
        }

    }
}