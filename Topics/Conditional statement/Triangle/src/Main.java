import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        boolean b1 = (A+B > C);
        boolean b2 = (A+C > B);
        boolean b3 = (B+C > A); 
        
        if (b1 && b2 && b3 ) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
        }
    }
