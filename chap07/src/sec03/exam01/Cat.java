package sec03.exam01;

public class Cat extends Animal {
	
	public Cat() {this.kind = "������";}
	// �߻�Ŭ������ ���� Ŭ������ ������ ��ð� �ݵ�� �ʿ�
	
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}
