package sec05;

public class Singleton {
	// ���� �ʵ� (����_������ �ϳ�_ �ν��Ͻ� ����)
	private static Singleton single = new Singleton();
	
	// ������ ** ���⼭ ���� �����ڰ� ��private�ΰ� �߿� **
	private Singleton() {
		
	}
	// ���� �޼ҵ�
	static Singleton getInstance() {
		return single;
	}
}
