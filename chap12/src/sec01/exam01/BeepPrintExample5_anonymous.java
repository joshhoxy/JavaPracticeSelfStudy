package sec01.exam01;

import java.awt.Toolkit;

// 스레드 익명 자식 객체 이용하기 _ 가장 많이 쓰이는 패턴
public class BeepPrintExample5_anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for(int i =0; i<5; i++ ) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					}catch (Exception e) {
					}
				}
			}
		};
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}

}
