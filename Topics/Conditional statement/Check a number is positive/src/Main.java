import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        
        int num = scanner.nextInt();
        
        if (num<=0) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
