package sec01.exam01;

import java.awt.Toolkit;

// ������ �͸� �ڽ� ��ü �̿��ϱ� _ ���� ���� ���̴� ����
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
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}

}
