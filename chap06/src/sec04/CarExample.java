package sec04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isGasLeft();
		if(gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}else {
			System.out.println("������ �����ϴ�.");
		}
		
		if(myCar.isGasLeft()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� ������ �ּ���.");
		}
	}

}
