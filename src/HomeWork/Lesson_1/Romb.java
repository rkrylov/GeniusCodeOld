package HomeWork.Lesson_1;

import java.util.Scanner;

public class Romb {

    public static void main(String[] arg){
        int size = setSize();
        drawRomb(1, size);
    }

    static void drawRomb(int val, int size){
        if (val == size*2){
            return;
        } else{
            int countSpaces;
            int countStars;
            String result = "";

            if (size > val) countSpaces = size - val;
            else countSpaces = val - size;

            countStars = size - countSpaces;
            for (int x = 0; x < countSpaces; x++){
                result += " ";
            }
            for (int x = 0; x < countStars; x++){
                result += "* ";
            }

            System.out.println(result);

            drawRomb(val + 1, size);
        }

    }

    static int setSize(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of romb:");
        int value = scanner.nextInt();
        return value;
    }
}
