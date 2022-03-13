package sec05;

public class Singleton {
	// 정적 필드 (정적_오로지 하나_ 인스턴스 생성)
	private static Singleton single = new Singleton();
	
	// 생성자 ** 여기서 접근 제한자가 ★private인게 중요 **
	private Singleton() {
		
	}
	// 정적 메소드
	static Singleton getInstance() {
		return single;
	}
}
