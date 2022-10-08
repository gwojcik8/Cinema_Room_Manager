
import java.util.Scanner;
class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean b = false;

        System.out.println("hello world");

        //if (n != 0 && m != 0 ) {
            for (int i = 1; i < n; i++) {
                System.out.println(i + "*" + m + "=" + i*m);
                if (i * m % k == 0) {
                    b = true;
                    }
                }
            for (int j = 1; j < m; j++) {
                System.out.println(j + "*" + n + "=" + j*n);
                if (n * j % k == 0) {
                    b = true;
                }
            }
        // }
        if (b) {
            System.out.println("YES");
         }
        else {
            System.out.println("NO");
        }
        }
}