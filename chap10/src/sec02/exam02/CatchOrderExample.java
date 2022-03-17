package sec02.exam02;

public class CatchOrderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String data1 = args[0];
		String data2 = args[1];
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		
		System.out.println(value1 + " + " + value2 + "= " + result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다."); // 예외도 상속의 개념이기 때문에 코드 실행문의 위쪽에 적용해야 catch문 먹힘
		}catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		}finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
