package sec06.package5;

public class B {

	//�ʵ�
	
	
	//������
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		// a.field3 = 1; ->������ ����: A�� filed3�� �����̺� �����̱� ������ ���� �Ұ�
		
		a.method1();
		a.method2();
		// a.method3(); -> ������ ����: A�� method3�� �����̺� �޼ҵ� �̱⶧���� ���� �Ұ� 
	}
	//�޼ҵ�
	
}
