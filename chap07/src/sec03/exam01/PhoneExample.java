package sec03.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone("��ȯ"); -> ������ ����: �߻�Ŭ������ �����ڷ� �ν��Ͻ� ������ �� ����. �׳� ���赵�̱� ����
		
		SmartPhone smartPhone = new SmartPhone("��ȯ");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		
	}
}
