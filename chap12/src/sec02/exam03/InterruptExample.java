package sec02.exam03;

public class InterruptExample {
	public static void main(String[] args) {
		PrintThread2 thread = new PrintThread2();
		
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
	
		thread.interrupt();
	}
}
