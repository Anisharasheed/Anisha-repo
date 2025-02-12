package prog1;

public class ThreadThree extends Thread {
	public static void main(String[] args) {
		ThreadThree t3=new ThreadThree();
		Thread p2 = new Thread();
		Thread p3 = new Thread();
		Thread p4 = new Thread();
		t3.start();
		p3.run();
	}
public void run() {
	System.out.println("From ThreadThree!"); 
	System.out.println("From ThreadThree!"); 
	System.out.println("From ThreadThree!"); 
	System.out.println("From ThreadThree!"); 
	System.out.println("From ThreadThree!"); 
}
}
