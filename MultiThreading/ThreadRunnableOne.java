package prog1;

public class ThreadRunnableOne implements Runnable {
public static void main(String[] args) {
	ThreadRunnableOne t4 = new ThreadRunnableOne();
	Thread w1 =new Thread(t4);
	w1.start();
}
	public void run() {
		System.out.println("From ThreadRunnableOne!");
		System.out.println("From ThreadRunnableOne!");
	}
}
