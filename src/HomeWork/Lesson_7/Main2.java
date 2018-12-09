package HomeWork.Lesson_7;

public class Main2 {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread(3000, "Thread1");
        MyThread myThread2 = new MyThread(3000, "Thread2");

        myThread1.start();

        try {
            myThread1.join(5000);
            System.out.println("join exit");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myThread2.start();

        System.out.println("Main finished");
    }
}
