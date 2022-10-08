import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i;
        int j;
        int k;
        // int l;

        int[][] matrix = new int[n][n];

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i - j > -1 ) {k = i - j;}
                else { k = j - i; }
                matrix[i][j] = k;
            }

        }

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
