package sec01.exam04;

public class Outter {
	// �ڹ� 7 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		
		class innerA {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	// �ڹ� 8 ����
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class inner{
			public void method() {
				int result = localVariable;
			}
		}
	}
	
}