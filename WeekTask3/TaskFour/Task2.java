package Task1;

public class ExceptionDemo {
    public static void tryCatchExample() {
        try {
            throw new Exception("Manual exception thrown");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
