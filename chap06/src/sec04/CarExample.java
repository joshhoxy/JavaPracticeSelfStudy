package sec04;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isGasLeft();
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}else {
			System.out.println("가스가 없습니다.");
		}
		
		if(myCar.isGasLeft()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입해 주세요.");
		}
	}

}
