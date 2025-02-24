package Task1;

public class Task5 implements Runnable {
    public void run() {
        System.out.println("Task 5: Sum of Prime Numbers");
        Thread primeThread = new Thread(new PrimeSumTask(1, 50));
        primeThread.start();
    }
}
