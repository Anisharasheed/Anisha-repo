package Task1;

import java.util.Arrays;

public class CopyAlternateElements {
    public static void copy() {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int[] result = new int[(numbers.length + 1) / 2];
        int index = 0;
        for (int i = 0; i < numbers.length; i += 2) {
            result[index++] = numbers[i];
        }
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Filtered: " + Arrays.toString(result));
    }
}


