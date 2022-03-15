package sec03.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone("승환"); -> 컴파일 에러: 추상클래스는 생성자로 인스턴스 생성할 수 없다. 그냥 설계도이기 때문
		
		SmartPhone smartPhone = new SmartPhone("승환");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		
	}
}
