package prog1;
import java.io.Serializable;
import  java.io.*;
public class 	Employee {
    public static void serialize()
    {
        try {
            //Creating the object
            employee1 e1 = new employee1(21,"anisha","anishahakunakmatata@gmail.com");
            //Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(e1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
