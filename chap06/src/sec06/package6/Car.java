package sec06.package6;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	//생성자
	//메소드
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed=0;
			return;
		}else
			this.speed = speed;
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		speed = 0;
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setSpeed(-50);
		System.out.println("현재 속도: "+ myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		System.out.println("현재 속도: "+ myCar.getSpeed());
	}
	
	
	
}
