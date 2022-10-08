import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int i;
        int j;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int indexi = 0;
        int indexj = 0;
        int max = Integer.MIN_VALUE;

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
               matrix[i][j] = scanner.nextInt();
            }
        }
        // max = matrix[0][0];

        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if ( max < matrix[i][j]) {
                    max = matrix[i][j];
                    indexi = i;
                    indexj = j;
                }
            }
        }
        System.out.println(indexi+" "+indexj);

    }
}