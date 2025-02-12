package prog1;

public class ThreadRunnableTwo implements Runnable {
	public static void main(String[] args) {
		ThreadRunnableTwo t5 = new ThreadRunnableTwo();
		Thread w3 =new Thread(t5);
		Thread w4 =new Thread(t5);
		w3.start();
		w4.run();
	}
public void run() {
	System.out.println("From ThreadRunnableTwo!"); 
	System.out.println("From ThreadRunnableTwo!"); 
	System.out.println("From ThreadRunnableTwo!"); 
}
}
