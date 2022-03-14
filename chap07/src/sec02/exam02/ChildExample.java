package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		//parent.method3(); -> compile Error: 메소드3는 child 클래스에서 정의되었기 때문에 Parent 객체에서 접근 못함
	}
}
