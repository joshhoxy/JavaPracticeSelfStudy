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
		 * �� ������ ����: parent�� ���ϵ� Ŭ�������� �з�Ʈ Ŭ������ ���� �� ��ȯ �Ǿ��� ������
		 * 				��Ģ������ Parent Ŭ������ �����ϱ⶧���� ChildClass�� �ʵ�� �޼ҵ带 ������� ���Ѵ�.
		 *  
		 */
		
		System.out.println("�� ��ȯ ��:");
		Child child = (Child) parent; 
		
		child.field2 = "Data2";
		
		System.out.println(child.field1);
		System.out.println(child.field2);
		child.method3();
	}
}
