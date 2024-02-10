public class main {
    public static void main(String[] args) {

            int [][] matrixLaura2x2 = {{4,3},{2,1}};
        int [][] matrixSophie3x3 = {{8,9,7},{6,5,4},{3,2,1}};
        int [][] matrixForScale = {{2,3},{4,5}};
        int scaleFactor = 2;

        int [][] scaledMatrix = Solutions.scale(matrixForScale, scaleFactor);
        System.out.println("The Scaled Matrix");
        printMatrix(scaledMatrix);

        int [][] timesMatrix = Solutions.timesMatrices(matrixForScale, matrixLaura2x2);
        System.out.println("the multiplied matrices");
        printMatrix(timesMatrix);

        int determinant2x2 = Solutions.findDeterminant2x2(matrixLaura2x2);
        System.out.println("Determinant of Laura's 2x2 is"+ determinant2x2);

        int determinant3x3 = Solutions.findDeterminant3x3(matrixSophie3x3);
        System.out.println("Determinant of Sophie's 3x3 is"+ determinant3x3);
   }

   private static void printMatrix(int[][]matrix){
        for(int [] row : matrix){
            for(int element : row){
                System.out.println(element + "");
            }
            int [][] scaledMatrix = Solutions.scale(matrixForScale, scaleFactor);
            System.out.println("scaled matrix is");
            printMatrix(scaledMatrix);

            int[][] timesMatrix = Solutions.timesMatrices(matrixForScale,matrixLaura2x2);
            System.out.println("the multiplied Matrix are");
            printMatrix(timesMatrix);

            int determinant2x2 = Solutions.findDeterminant2x2(matrixLaura2x2);
            System.out.println("Determinant of Lauras 2x2 Matrix is"+determinant2x2);

            int determinant2x3 = Solutions.findDeterminant3x3(matrixSophie3x3);
            System.out.println("Determinant of Sophies 3x3 Matrix is" + determinant3x3);

        }

        private static void printMatrix(int[][] matrix){
            for(int[] row : matrix){
                for(int element : row){
                    System.out.print(element + "");

                }
                System.out.println();
            }
            System.out.println();
       }
   }
}
