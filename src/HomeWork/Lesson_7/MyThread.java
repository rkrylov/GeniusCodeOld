package HomeWork.Lesson_7;

public class MyThread extends Thread{
    long sleepMillis;
    String name;

    public MyThread(long sleepMillis, String name) {
        super(name);
        this.sleepMillis = sleepMillis;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started");
        try {
            Thread.sleep(sleepMillis);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " finished");
    }
}
