package prog1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialixable {
	public static void main(String[] args) throws IOException {
    try{
    //Creating the object
    Student s1 =new Student(112,"anisha");
    //Creating stream and writing the object
    FileOutputStream fout=new FileOutputStream("f.txt");
    ObjectOutputStream out=new ObjectOutputStream(fout);
    out.writeObject(s1);
    out.flush();
    //closing the stream
    out.close();
    System.out.println("success");
}
catch(Exception e){System.out.println(e);}
}
}
