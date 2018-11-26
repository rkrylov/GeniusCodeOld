package HomeWork.Lesson_1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Files {
    public static void main(String[] arg) {

        Matrix matrixObj = new Matrix();
        matrixObj.setMatrix();
        matrixObj.mixMatrix();
        int[][] matrix = matrixObj.getMatrix();

        try (FileWriter out = new FileWriter("reflected_matrix.txt")) {
            String text = "";
            for (int x = 0; x < matrix.length; x++) {
                out.write(text + Arrays.toString(matrix[x]) + "\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
