package sec04;

public class Car {
	//�ʵ�
	
	int gas;
	
	//������
	
	//�޼ҵ�
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isGasLeft() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		else {
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if (gas>0) {
				System.out.println("�޸��ϴ�. (gas�ܷ�: "+ gas + ")");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				gas -=1;
			}
			else {
				System.out.println("����ϴ�. (gas�ܷ�: "+ gas + ")");
				return;
			}
		}
	}
	
}
