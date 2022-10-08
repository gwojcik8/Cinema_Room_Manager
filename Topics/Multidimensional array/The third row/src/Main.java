class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        // write your code here
        int k=2;
        int row3 = twoDimArray[k].length;

        for (int i =0; i < row3; i++) {
            System.out.print(twoDimArray[k][i]+" ");
        }
    }
}