package sec01.exam01;

import java.awt.Toolkit;

//메인 스레드만 이용한 경우
public class BeepPrintExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i =0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}catch(Exception e){
				
			}
		}
		for (int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}

}
