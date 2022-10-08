import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        
        boolean b1 = A<=B;
        boolean b2 = (H >=A && H <= B);
        
        if (b1) {
            if (H < A) {
                System.out.println("Deficiency");
            }
            if (H > B) {
                System.out.println("Excess");
            }
            if (b2) {
                System.out.println("Normal");
            }
        }
    }
}
