package sec03.exam01;

public class Cat extends Animal {
	
	public Cat() {this.kind = "포유류";}
	// 추상클래스의 하위 클래스는 생성자 명시가 반드시 필요
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
