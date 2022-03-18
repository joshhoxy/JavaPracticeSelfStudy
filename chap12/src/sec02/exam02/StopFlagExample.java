package sec02.exam02;

// 스레드를 안전하게 종료하는 방법 - Flag를 활용
public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 thread = new PrintThread1();
		
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch (Exception e) {}
		
		thread.setStop(true);
		
		
	}
}
