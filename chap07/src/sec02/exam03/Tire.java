package sec02.exam03;

public class Tire {
	
	//�ʵ�
	public int maxRotation;
	public int accumulateRotation =0;
	public String location;
	
	//������
	public Tire (String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼ҵ�
	public boolean roll() {
		++accumulateRotation;
		if (accumulateRotation<maxRotation) {
			System.out.println(location + "Tire ����: " + (maxRotation-accumulateRotation)+ "ȸ");
			return true;
		}else {
			System.out.println("***" + location + "Tire ��ũ ***");
		}return false;
	}
}
