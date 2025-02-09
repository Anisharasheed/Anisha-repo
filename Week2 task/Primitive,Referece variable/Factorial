import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int trailingZeroes = countTrailingZeroes(num);
        System.out.println("Number of trailing zeroes in " + num + "! : " + trailingZeroes);
    }

    public static int countTrailingZeroes(int num) {
        int count = 0;
        while (num >= 5) {
            num /= 5;
            count += num;
        }
        return count;
    }
}

