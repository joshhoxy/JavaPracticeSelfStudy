package sec01.exam01;

import java.awt.Toolkit;

// 스레드 상속받아서 run() 메소드 오버라이딩해서 하위 클래스 생성
public class BeepThread extends Thread{
	@Override 
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i =0; i<5; i++) {
		toolkit.beep();
		try {
			Thread.sleep(500);
		}catch(Exception e ) {}
	}
	}
}
