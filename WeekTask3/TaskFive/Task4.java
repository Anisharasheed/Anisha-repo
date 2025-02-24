package Task1;
import java.util.Arrays;

public class Task4 implements Runnable {
    public void run() {
        System.out.println("Task 4: Matrix Multiplication");
        int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{2, 0}, {1, 2}};
        int[][] C = new int[2][2];

        Thread[] threads = new Thread[2];
        for (int i = 0; i < 2; i++) {
            threads[i] = new Thread(new MatrixTask(A, B, C, i));
            threads[i].start();
        }
        for (Thread t : threads) {
            try { t.join(); } catch (InterruptedException e) {}
        }
        System.out.println("Matrix Multiplication Result: " + Arrays.deepToString(C));
    }
}
