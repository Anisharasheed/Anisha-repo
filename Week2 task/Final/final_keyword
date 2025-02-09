package Final2;
import java.util.Scanner;

class Final{
    final int MAX_VALUE = 100;
    final void display() { 
        System.out.println("Final method cannot be overridden.");
    }
}

final class FinalClass { 
    void showMessage() {
        System.out.println("This is a final class.");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        Final obj = new Final();
        System.out.println("Final variable: " + obj.MAX_VALUE);
        obj.display();
        
        FinalClass obj2 = new FinalClass();
        obj2.showMessage();
    }
}
