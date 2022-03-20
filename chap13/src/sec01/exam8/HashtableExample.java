package sec01.exam8;

import java.util.*;

// 아이디와 비밀번호 검사하기
// ※NOTE
//	: Hashtable은 HashMap과 동일한 내부구조를 가지고 있다. 하지만 
//	  차이점은 Hashtable의 경우 메소드가 synchronized 이기 때문에 Thread safe 하다.

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
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.println("아이디: ");
			String id = scanner.nextLine();
			System.out.println("비밀번호: ");
			String pwd = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.containsValue(pwd)) {
					System.out.println("로그인 되었습니다.");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
		
	}
}
