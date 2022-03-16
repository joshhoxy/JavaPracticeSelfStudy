package sec01.exam05;

public class OutterExample {
	public static void main(String[] args) {
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested(); // ★ [바깥 클래스 인스턴스].[생성자 호출]
		nested.print();
	}
}
