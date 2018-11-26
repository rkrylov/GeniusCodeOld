package HomeWork.Lesson_1;


public class Fibonacci {
    static int maxNumber = 6;

    public static void main(String[] arg) {
        System.out.println(fibonacci(maxNumber));
    }

    static int fibonacci(int index) {
        if (index == 0) {
            return index;
        } else if (index == 1) {
            return index;
        } else {
            int result = fibonacci(index - 1) + fibonacci(index - 2);
            return result;
        }
    }
}
