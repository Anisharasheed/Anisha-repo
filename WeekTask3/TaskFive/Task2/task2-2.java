package Task1;

public class NumberTask implements Runnable {
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
