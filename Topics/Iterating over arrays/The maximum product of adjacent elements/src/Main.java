import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i;
        int[] array = new int[n];
        int max = 0;

        for (i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (i = 1;i < n; i++) {
            if (array[i-1]*array[i] > max) {
                max = array[i-1]*array[i];
            }
        }

        System.out.println(max);
    }
}