package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		//parent.method3(); -> compile Error: �޼ҵ�3�� child Ŭ�������� ���ǵǾ��� ������ Parent ��ü���� ���� ����
	}
}
