package Task1;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void demonstrateArrayCopy() {
        int[] data = {5, 15, 25, 35, 45, 55};
        int[] copiedData = Arrays.copyOfRange(data, 2, 5);
        System.out.println("Original: " + Arrays.toString(data));
        System.out.println("Copied: " + Arrays.toString(copiedData));
    }
}
