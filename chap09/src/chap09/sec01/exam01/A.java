package chap09.sec01.exam01;

// �ٱ� Ŭ����
public class A {
	
	
	// Ŭ���� A�� ������
	A(){
		System.out.println("A ��ü�� ������");
	}
	
	// ### Ŭ���� A�� �ʵ� ### 
	
	//�ν��Ͻ� ��� Ŭ����
	class B{
		
		int field1;
		// static int field2;
		B(){
			System.out.println("B ��ü�� ������");
		}
		void method1() {}
		// static void method2(){}
	}
	// ���� ��� Ŭ����
	static class C{
		C() {System.out.println("C ��ü�� ������");
	}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	// ### Ŭ���� A�� �޼ҵ� ### 
	void method() {
		// ���� Ŭ����
		class D {
			D(){System.out.println("D ��ü�� ������");}
			
			int field1; 
			//static field2;
			void method1() {}
			// static void method2
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
