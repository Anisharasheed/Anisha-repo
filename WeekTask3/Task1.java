package Task1;
import java.util.*;
public class Student {

	    static class StudentData {
	        String name;
	        int[] marks;
	        int total;
	        double average;

	        public StudentData(String name, int[] marks) {
	            this.name = name;
	            this.marks = marks;
	            this.total = 0;
	            for (int mark : marks) {
	                this.total += mark;
	            }
	            this.average = (double) this.total / marks.length;
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println("Task 1: Copy Alternative Elements in an Array");
	        copyAlternateElements();

	        System.out.println("\nTask 2: Student Marks Calculation & Sorting");
	        handleStudentRecords();

	        System.out.println("\nTask 3: Compare equals() and deepEquals()");
	        compareEqualityMethods();

	        System.out.println("\nTask 4: Copy Part of an Array");
	        demonstrateArrayCopy();

	        System.out.println("\nTask 5: Capitalize Alternate Characters in a String");
	        modifyString("developer");
	    }

	    public static void copyAlternateElements() {
	        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
	        int[] result = new int[(numbers.length + 1) / 2];
	        int index = 0;
	        for (int i = 0; i < numbers.length; i += 2) {
	            result[index++] = numbers[i];
	        }
	        System.out.println("Original: " + Arrays.toString(numbers));
	        System.out.println("Filtered: " + Arrays.toString(result));
	    }

	    public static void handleStudentRecords() {
	        StudentData[] students = {
	            new StudentData("John", new int[]{78, 85, 90}),
	            new StudentData("Alice", new int[]{88, 92, 80}),
	            new StudentData("Bob", new int[]{70, 75, 95})
	        };

	        Arrays.sort(students, Comparator.comparingInt(s -> -s.total));

	        for (StudentData s : students) {
	            System.out.println(s.name + " - Total: " + s.total + ", Avg: " + s.average);
	        }
	    }

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

	    public static void demonstrateArrayCopy() {
	        int[] data = {5, 15, 25, 35, 45, 55};
	        int[] copiedData = Arrays.copyOfRange(data, 2, 5);
	        System.out.println("Original: " + Arrays.toString(data));
	        System.out.println("Copied: " + Arrays.toString(copiedData));
	    }

	    public static void modifyString(String input) {
	        char[] textArray = input.toCharArray();
	        for (int i = 0; i < textArray.length; i++) {
	            if (i % 2 == 0) {
	                textArray[i] = Character.toUpperCase(textArray[i]);
	            }
	        }
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + new String(textArray));
	    }
	}


