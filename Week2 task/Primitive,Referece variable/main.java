public class Main {

    public static void main(String[] args) {
        int num = 10;
        int[] arr = {1, 2, 3, 4, 5};

        modifyValues(num, arr);

        System.out.println("Value of num in main: " + num);
        System.out.print("Array in main: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void modifyValues(int num, int[] arr) {
        num = 20;
        arr[0] = 10;
    }
}
