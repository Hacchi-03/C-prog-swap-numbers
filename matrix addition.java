public class AddMatrices {

    public static void main(String[] args) {
        int rows = 3, columns = 3;
        
        int[][] firstMatrix = { {1, 3, 4}, {2,4,3},{3,4,5} };
        int[][] secondMatrix = { {1, 3, 4}, {2,4,3},{1,2,4} };
       
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

       
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
