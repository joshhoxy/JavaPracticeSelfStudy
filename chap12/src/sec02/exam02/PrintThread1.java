package sec02.exam02;

public class PrintThread1 extends Thread{
	private boolean stop;
	
	@Override
	public void run() {
		
		while(!stop) {
			System.out.println("������");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
