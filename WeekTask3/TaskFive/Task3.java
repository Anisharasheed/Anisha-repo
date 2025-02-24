package Task1;
import java.util.Arrays;

public class Task3 implements Runnable {
    public void run() {
        System.out.println("Task 3: Sorting an Array");
        int[] arr = {5, 1, 9, 3, 7};
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
