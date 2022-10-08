import java.util.*;

public class Main {

    // write a method here
    public static void addValueByIndex(long[] array, int index, long value) {
        int len = array.length;

        if (index < len) {
            array[index] = array[index] + value;
        }
/*        for (int i = 0; i < len; i++) {
            System.out.print(array[i]+" ");
        }
*/




    }


    // don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToLong(Long::parseLong)
                .toArray();
        int index = scanner.nextInt();
        long value = scanner.nextLong();
        addValueByIndex(array, index, value);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}