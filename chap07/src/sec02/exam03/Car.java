package sec02.exam03;

public class Car {
	Tire frontLeftTire = new Tire("�տ���", 6);
	Tire frontRightTire = new Tire("�տ�����", 2);
	Tire backLeftTire = new Tire("�ڿ���",3);
	Tire backRightTire = new Tire("�� ������", 4);
	
	//������
	
	public Car () {}
	
	//�޼ҵ�
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if(!frontLeftTire.roll()) {stop(); return 1;}
		if(!frontRightTire.roll()) {stop(); return 2;}
		if(!backLeftTire.roll()) {stop(); return 3;}
		if(!backRightTire.roll()) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}


}

