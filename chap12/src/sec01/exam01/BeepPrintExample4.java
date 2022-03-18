package sec01.exam01;

// 스레드 하위클래스 작성하여서 인스턴스 생성후에 바로 실행
public class BeepPrintExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i =0; i<5; i++ ) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch (Exception e) {}
		}
	}
}
