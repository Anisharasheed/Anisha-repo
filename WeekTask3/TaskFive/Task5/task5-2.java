package Task1;

public class PrimeSumTask implements Runnable {
    private int start, end;

    public PrimeSumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        long sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) sum += i;
        }
        System.out.println("Prime Sum: " + sum);
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
