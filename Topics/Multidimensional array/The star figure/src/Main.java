import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mid = n / 2 + 1;
        int i;
        int j;
        // System.out.println(n);
        // System.out.println(mid);

        char[][] star = new char[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                star[i][j] = '.';
            }
        }

        for (i = 0; i < n; i++) {
            for (j = mid - 1; j < mid; j++) {
                star[i][j] = '*';
            }
        }

        for (i = mid - 1; i < mid; i++) {
            for (j = 0; j < n; j++) {
                star[i][j] = '*';
            }
        }

        for (i = 0; i < n; i++) {
            star[i][i] = '*';
        }
        for (i = 0; i < n; i++) {
            star[i][n - i - 1] = '*';
        }


        // printout
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(star[i][j] + " ");
            }
            System.out.println();
        }

    }
}