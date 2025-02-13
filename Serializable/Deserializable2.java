package prog1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialize2 {
	 public static void deserialize() {
	        try {
	            //Creating stream to read the object
	            ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.txt"));
	            employee1 s1  = (employee1) in.readObject();
	            //printing the data of the serialized object
	            System.out.println(s1.eno + " " + s1.ename);
	            //closing the stream
	            in.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public static void main (String [] args) throws IOException
	    { 
	        serialize();
	        deserialize();
	    }

		public static  void serialize()
		{
			try {
			//Creating the object
		    employee1 s1 =new employee1(112,"anisha","aniiiiii@gmail.com");
		    //Creating stream and writing the object
		    FileOutputStream fout=new FileOutputStream("employee.txt");
		    ObjectOutputStream out=new ObjectOutputStream(fout);
		    out.writeObject(s1);
		    out.flush();
		    //closing the stream
		    out.close();
		    System.out.println("success");
		}
		catch(Exception e){System.out.println(e);
		}
		
}
}
		
