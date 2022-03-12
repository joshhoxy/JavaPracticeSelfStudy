package sec04;

public class Car {
	//필드
	
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isGasLeft() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if (gas>0) {
				System.out.println("달립니다. (gas잔량: "+ gas + ")");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				gas -=1;
			}
			else {
				System.out.println("멈춥니다. (gas잔량: "+ gas + ")");
				return;
			}
		}
	}
	
}
