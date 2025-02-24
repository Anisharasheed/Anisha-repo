package Task1;

import java.util.Arrays;

public class EqualityComparison {
    public static void compareEqualityMethods() {
        Integer[] listA = {10, 20, 30};
        Integer[] listB = {10, 20, 30};
        Integer[][] nestedA = {{1, 2}, {3, 4}};
        Integer[][] nestedB = {{1, 2}, {3, 4}};

        System.out.println("Arrays.equals(): " + Arrays.equals(listA, listB));
        System.out.println("Arrays.deepEquals(): " + Arrays.deepEquals(listA, listB));
        System.out.println("Nested Arrays.equals(): " + Arrays.equals(nestedA, nestedB));
        System.out.println("Nested Arrays.deepEquals(): " + Arrays.deepEquals(nestedA, nestedB));
    }
}
