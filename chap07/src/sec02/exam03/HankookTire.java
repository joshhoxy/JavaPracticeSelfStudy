package sec02.exam03;

public class HankookTire extends Tire { //��� �ڵ�� �׻� Ŭ���� ���𹮿� �־����
	//�ʵ�
	//������
	public HankookTire (String location, int maxRotation) {
		super(location, maxRotation);
	}
	//�޼ҵ�
	@Override
	public boolean roll() {
		++accumulateRotation;
		if(accumulateRotation<maxRotation) {
			System.out.println(location + "HankookTire ����: " + (maxRotation-accumulateRotation) + "ȸ");
			return true;
		}else {
			System.out.println("***" + location + "HankookTire ��ũ***");
			return false;
		}
	}
}
