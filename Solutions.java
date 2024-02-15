public class Solutions {
    //scale the matrix by scale factor using a for loop
    public static int[][] scale(int[][] matrix, int scaleFactor) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; i < matrix[i].length; i++) {
                matrix[i][j] *= scaleFactor;
            }
        }
        return matrix;

    } //multiply any matrices that are the same length

    public static int[][] timesMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrices cannot be multiplied together");
            return null;
        }
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }

            }
        }
        return result;
    }

    public static int findDeterminant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            System.out.println("Wrong for 2x2");
            return 0;
        }
        public static int findDeterminant3x3 ( int[][] matrix){
            if (matrix.length != 3 || matrix[0].length != 3) {
                System.out.println("Wrong for 3x3");
                return 0;
            }
            return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
                    matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
                    matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        }
    }
}
