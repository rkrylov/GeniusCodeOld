package HomeWork.Lesson_7;

public class Main {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread(3000, "Thread1");
        MyThread myThread2 = new MyThread(5000, "Thread2");

        myThread1.start();
        myThread2.start();

        System.out.println("Main finished");
    }
}
