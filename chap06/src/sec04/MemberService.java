package sec04;

public class MemberService {
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		else
			return false;
	}
}
