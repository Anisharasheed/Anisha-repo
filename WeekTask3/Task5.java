package Task1;
import java.util.*;
public class Threads {
	    public static void main(String[] args) {
	        Thread task1 = new Thread(new Task1());
	        Thread task2 = new Thread(new Task2());
	        Thread task3 = new Thread(new Task3());
	        Thread task4 = new Thread(new Task4());
	        Thread task5 = new Thread(new Task5());

	        task1.start();
	        task2.start();
	        task3.start();
	        task4.start();
	        task5.start();
	    }
	}

	class Task1 implements Runnable {
	    public void run() {
	        System.out.println("Task 1: Hello, Java!");
	    }
	}

	class Task2 implements Runnable {
	    public void run() {
	        System.out.println("Task 2: Even & Odd Numbers");
	        Thread evenThread = new Thread(new NumberTask(2, 20));
	        Thread oddThread = new Thread(new NumberTask(1, 19));
	        evenThread.start();
	        oddThread.start();
	    }
	}

	class Task3 implements Runnable {
	    public void run() {
	        System.out.println("Task 3: Sorting an Array");
	        int[] arr = {5, 1, 9, 3, 7};
	        Arrays.sort(arr);
	        System.out.println("Sorted Array: " + Arrays.toString(arr));
	    }
	}

	class Task4 implements Runnable {
	    public void run() {
	        System.out.println("Task 4: Matrix Multiplication");
	        int[][] A = {{1, 2}, {3, 4}}, B = {{2, 0}, {1, 2}}, C = new int[2][2];
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

	class Task5 implements Runnable {
	    public void run() {
	        System.out.println("Task 5: Sum of Prime Numbers");
	        Thread primeThread = new Thread(new PrimeSumTask(1, 50));
	        primeThread.start();
	    }
	}

	class NumberTask implements Runnable {
	    private int start, end;
	    public NumberTask(int start, int end) {
	        this.start = start;
	        this.end = end;
	    }
	    public void run() {
	        for (int i = start; i <= end; i += 2) {
	            System.out.println(i);
	        }
	    }
	}

	class MatrixTask implements Runnable {
	    private int[][] A, B, C;
	    private int row;
	    public MatrixTask(int[][] A, int[][] B, int[][] C, int row) {
	        this.A = A;
	        this.B = B;
	        this.C = C;
	        this.row = row;
	    }
	    public void run() {
	        for (int i = 0; i < B[0].length; i++)
	            for (int j = 0; j < B.length; j++)
	                C[row][i] += A[row][j] * B[j][i];
	        System.out.println("Row " + row + " Computed: " + Arrays.toString(C[row]));
	    }
	}

	class PrimeSumTask implements Runnable {
	    private int start, end;
	    public PrimeSumTask(int start, int end) {
	        this.start = start;
	        this.end = end;
	    }
	    public void run() {
	        long sum = 0;
	        for (int i = start; i <= end; i++) if (isPrime(i)) sum += i;
	        System.out.println("Prime Sum: " + sum);
	    }
	    private boolean isPrime(int num) {
	        if (num < 2) return false;
	        for (int i = 2; i * i <= num; i++) if (num % i == 0) return false;
	        return true;
	    }
	}
