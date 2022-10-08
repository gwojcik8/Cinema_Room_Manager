import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] tableIn = new int[n][m];
        int[][] tableOut = new int[m][n];
        int i;
        int j;

        //read in table
        for (i = 0; i < n ; i++ ) {
            for (j = 0; j < m; j++) {
                tableIn[i][j] = scanner.nextInt();
            }
        }

        for (i = m-1; i > -1; i--) {
            for (j = 0; j < n; j++) {
                tableOut[i][j] = tableIn[j][i];
            }
        }

        for (i = 0; i < m ; i++ ) {
            for (j = n-1; j > -1; j--) {
                System.out.print(tableOut[i][j]+" ");
            }
            System.out.println();
        }
    }
}