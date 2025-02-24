package Task1;

public class Main {
    public static void main(String[] args) {
        Thread task1 = new Thread(new Task1());
        Thread task2 = new Thread(new Task2());
        Thread task3 = new Thread(new Task3());
        Thread task4 = new Thread(new Task4());
        Thread task5 = new Thread(new Task5());

        task1.start();
        task2.start();
        task3.start();
        task4.start();
        task5.start();
    }
}
