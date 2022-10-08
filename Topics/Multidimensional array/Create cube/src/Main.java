class ArrayOperations {
    public static int[][][] createCube() {
        // write your code here
        int n = 3;
        int i;
        int j;
        int k;
        int row;

        int[][][] cube = new int[n][n][n];

        for (i = 0; i < n; i++) {
            row = 0;
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    cube[i][j][k] = row;
                    row++;
                    // System.out.print(cube[i][j][k]+" ");
                }
                //System.out.print("-");
            }
            //System.out.println();
        }
        return cube;
    }

}