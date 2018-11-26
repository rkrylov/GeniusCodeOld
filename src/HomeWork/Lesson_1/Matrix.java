package HomeWork.Lesson_1;

public class Matrix {

    int[][] matrix = new int[5][5];

    public static void main(String[] arg) {
        Matrix matrixObj = new Matrix();
        matrixObj.setMatrix();
        matrixObj.printMatrix();
        matrixObj.mixMatrix();
        matrixObj.printMatrix();
    }

    void setMatrix() {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length; y++) {
                matrix[x][y] = y;
            }
        }
    }

    int[][] getMatrix(){
        return matrix;
    }

    void printMatrix() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println("\t");
        }
        System.out.println("==========");
    }

    void mixMatrix() {
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0 + x; y < matrix.length; y++) {
                int temp = matrix[y][x];
                matrix[y][x] = matrix[x][y];
                matrix[x][y] = temp;
            }
        }
    }
}
