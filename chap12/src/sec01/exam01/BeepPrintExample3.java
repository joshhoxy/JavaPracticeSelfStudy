package sec01.exam01;

import java.awt.Toolkit;

// 익명 객체 이용하여 스레드 생성
public class BeepPrintExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(new Runnable (){
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				
				for (int i =0; i<5; i++) {
					toolkit.beep();
					
					try {
						Thread.sleep(500);
					} catch(Exception e) {}
				}
			}
		}); 
		thread.start(); // ★ 스레드는 무적권 스타트 메소드를 호출해야 실행된다!!!!!!!!!!!!!!!!!!! 
			
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e){}
		}
		
		
	}

}
