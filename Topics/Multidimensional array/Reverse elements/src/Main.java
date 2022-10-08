/*
public class Main {

    public static void main(String args[]) {

        int array[][] = { { 0, 0, 9, 9 }, { 1, 2, 3, 4 }, { 5, 6, 7,8 } };
        int rows = array.length;
        int columns = array[0].length;
        int[][] reverseRow = new int[rows][columns];
        int k = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                k=columns-1-j;
                reverseRow[i][j] = array[i][k];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = reverseRow[i][j];
            }
        }
    }
}
*/

class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        int row = twoDimArray.length;
        int col = twoDimArray[0].length;

        // create new temporary twin array and assign reverse row sequence
        int[][] reverseRow = new int[row][col];
        int k = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                k=col-1-j;
                reverseRow[i][j] = twoDimArray[i][k];
            }
        }
        // assign reverse row sequence in original array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                twoDimArray[i][j] = reverseRow[i][j];
            }
        }
    }
}
