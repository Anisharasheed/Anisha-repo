package Task1;

import java.util.Arrays;
import java.util.Comparator;

public class StudentRecords {
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
}
