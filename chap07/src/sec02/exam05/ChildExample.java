package sec02.exam05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2 = "data2";
		 * parent.method3();
		 * 
		 * └ 컴파일 에러: parent는 차일드 클래스에서 패런트 클래스로 강제 형 변환 되었기 때문에
		 * 				원칙적으로 Parent 클래스를 참조하기때문에 ChildClass의 필드와 메소드를 사용하지 못한다.
		 *  
		 */
		
		System.out.println("형 변환 후:");
		Child child = (Child) parent; 
		
		child.field2 = "Data2";
		
		System.out.println(child.field1);
		System.out.println(child.field2);
		child.method3();
	}
}
