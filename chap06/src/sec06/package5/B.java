package sec06.package5;

public class B {

	//필드
	
	
	//생성자
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		// a.field3 = 1; ->컴파일 에러: A의 filed3는 프라이빗 변수이기 때문에 접근 불가
		
		a.method1();
		a.method2();
		// a.method3(); -> 컴파일 에러: A의 method3는 프라이빗 메소드 이기때문에 접근 불가 
	}
	//메소드
	
}
