public class MultiplyMatrices {

    public static void main(String[] args) {
        int r1 = 3, c1 = 3;
        int r2 = 3, c2 = 3;
        int[][] firstMatrix = { {1, 3, 4}, {2,4,3},{3,4,5} };
        int[][] secondMatrix = { {1, 3, 4}, {2,4,3},{1,2,4} };
       
        
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }
        
        System.out.println("Sum of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
