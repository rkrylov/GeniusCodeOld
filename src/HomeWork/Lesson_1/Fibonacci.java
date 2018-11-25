package HomeWork.Lesson_1;

import java.util.Arrays;

public class Fibonacci {

    static int[] arr = new int[11];

    public static void main(String[] arg){
        fibonacci(10);
        System.out.println(Arrays.toString(arr));
    }

    static int fibonacci(int index){
        if(index == 0){
            arr[index] = index;
            return 0;
        } else if(index == 1){
            arr[index] = index;
            return arr[index];
        }

        arr[index] = fibonacci(index-1)+arr[index-2];
        return arr[index];
    }
}
