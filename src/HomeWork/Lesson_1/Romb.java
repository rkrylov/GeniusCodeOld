package HomeWork.Lesson_1;

import java.util.Scanner;

public class Romb {

    static int size;
    Scanner scanner = new Scanner(System.in);
    String[][] romb = new String[size][size];

    public static void main(String[] arg){



    }
//    String[][] makeRomb(String[][] romb){
//        for(int x = 0; x<size; x++){
//            for(int y =
//        }
//    }

    void setSize(){
        System.out.println("Enter size of romb(odd(непарное) number):");
        int value = scanner.nextInt();
        if(value%2 != 0) size = value;
        else {
            System.out.println("Odd number!");
            value = scanner.nextInt();
            size = value;
        }
    }
}
