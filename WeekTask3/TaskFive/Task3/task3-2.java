package Task1;
import java.util.Arrays;

public class MatrixTask implements Runnable {
    private int[][] A, B, C;
    private int row;

    public MatrixTask(int[][] A, int[][] B, int[][] C, int row) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.row = row;
    }

    public void run() {
        for (int i = 0; i < B[0].length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[row][i] += A[row][j] * B[j][i];
            }
        }
        System.out.println("Row " + row + " Computed: " + Arrays.toString(C[row]));
    }
}
