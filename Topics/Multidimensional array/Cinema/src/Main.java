// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int sum = 0;
        boolean stop = false;

        if (k == m) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m - 1; j++) {
                    sum = sum + array[i][j];
                }
                if (sum == 0) {
                    System.out.println(i+1);
                    stop = true;
                }
                if (stop) {break;}
            }
            System.out.println("0");
        }
        else if (k == 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m - 1; j++) {
                    if (array[i][j] == 0) {
                        System.out.println(i + 1);
                        stop = true;
                        // System.out.println(stop);
                    }
                    if (stop) {break;}
                }
                if (stop) {break;}
            }
            if (!stop) {
                System.out.println("0");
                System.out.println("no way");
            }
        }
        else {
            for (int i = 0; i < n; i++) {
                sum = 0;
                //System.out.println("iteration ="+i);
                for (int j = 0; j < m - 1; j++) {

                    // System.out.println("sub iteration = " + j);
                    if (array[i][j] == 0) {
                        sum = 1;
                    }
                    if (array[i][j] == 0 && array[i][j + 1] == 0) {
                        sum = sum + 1;

                        // System.out.println("sum="+sum);
                        // stop = true;
                        if (sum >= k) {
                            // System.out.println("row = "+ (i + 1));
                            System.out.println(i + 1);
                            stop = true;
                        }
                        if (stop) {
                            break;
                        }
                    }
                }
                if (stop) {
                    break;
                }
                // System.out.println("no way");
            }
            if (!stop) {
                System.out.println("0");
                // System.out.println("no way");
            }
        }
    }
}
