package sec03;

public class QstopExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode==113) {
				break;
			}
		}
		System.out.println("����");
	}

}
