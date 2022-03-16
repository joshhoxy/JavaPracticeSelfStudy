package sec01.exam02;

public class A {
	// 클래스 A의 필드 - 멤버 클래스 선언 
	class B{}
	static class C{}
	
	B field1 = new B();
	C field2 = new C();
	
	// 정적필드 초기화
	// static B field3 = new B();
	static C field4 = new C();
	
	
	// 클래스 A의 생성자
	
	// 클래스 A의 메소드
	void method1() {
		
		B var1 = new B();
		C var2 = new C();
	}
	
	// 클래스 A의 메소드 _ 정적 메소드
	static void method2() {
		// B var1 = new B();
		C var2 = new C();
	}
	
	
}
