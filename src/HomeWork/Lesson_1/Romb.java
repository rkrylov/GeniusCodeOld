package HomeWork.Lesson_1;

import java.util.Scanner;

public class Romb {


    public static void main(String[] arg){
        int size = setSize();
        String[][] romb = makeRomb(size);
        printRomb(romb);
    }
    static String[][] makeRomb(int size){
        String[][] matrix = new String[size][size];
        int center = size/2;
        int countStars = 0;

        for(int x = 0; x<size; x++){
            for(int y = 0; y<size; y++){
                if(y < center-countStars || y > center+countStars)
                    matrix[x][y] = " ";
                else
                    matrix[x][y] = "*";
            }
            if(x<center)
                countStars++;
            else
                countStars--;
        }
        return matrix;
    }

    static int setSize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of romb(odd(непарное) number):");
        int value = scanner.nextInt();
        if(value%2 != 0) return value;
        else {
            System.out.println("Odd number!");
            value = scanner.nextInt();
            return value;
        }
    }

    static void printRomb(String[][] matrix){
        for(int x = 0; x < matrix.length; x++){
            for(int y = 0; y < matrix.length; y++){
                System.out.print(matrix[x][y]+" ");
            }
            System.out.println("\t");
        }
    }
}
