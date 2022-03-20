package sec01.exam8;

import java.util.*;

// ���̵�� ��й�ȣ �˻��ϱ�
// ��NOTE
//	: Hashtable�� HashMap�� ������ ���α����� ������ �ִ�. ������ 
//	  �������� Hashtable�� ��� �޼ҵ尡 synchronized �̱� ������ Thread safe �ϴ�.

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("Summer", "123");
		map.put("Fall", "1234");
		map.put("Winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.println("���̵�: ");
			String id = scanner.nextLine();
			System.out.println("��й�ȣ: ");
			String pwd = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.containsValue(pwd)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			}
		}
		
	}
}
