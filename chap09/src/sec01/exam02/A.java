package sec01.exam02;

public class A {
	// Ŭ���� A�� �ʵ� - ��� Ŭ���� ���� 
	class B{}
	static class C{}
	
	B field1 = new B();
	C field2 = new C();
	
	// �����ʵ� �ʱ�ȭ
	// static B field3 = new B();
	static C field4 = new C();
	
	
	// Ŭ���� A�� ������
	
	// Ŭ���� A�� �޼ҵ�
	void method1() {
		
		B var1 = new B();
		C var2 = new C();
	}
	
	// Ŭ���� A�� �޼ҵ� _ ���� �޼ҵ�
	static void method2() {
		// B var1 = new B();
		C var2 = new C();
	}
	
	
}
