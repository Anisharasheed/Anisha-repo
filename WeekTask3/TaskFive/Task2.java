package Task1;

public class Task2 implements Runnable {
    public void run() {
        System.out.println("Task 2: Even & Odd Numbers");
        Thread evenThread = new Thread(new NumberTask(2, 20));
        Thread oddThread = new Thread(new NumberTask(1, 19));
        evenThread.start();
        oddThread.start();
    }
}
