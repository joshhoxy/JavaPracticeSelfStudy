package sec01.exam01;

import java.awt.Toolkit;

// ������ ��ӹ޾Ƽ� run() �޼ҵ� �������̵��ؼ� ���� Ŭ���� ����
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
