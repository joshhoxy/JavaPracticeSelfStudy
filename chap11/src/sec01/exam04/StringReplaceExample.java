package sec01.exam04;

public class StringReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStr = "�ڹٴ� ��ü ���� ����Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		oldStr = oldStr.replace("�ڹ�", "JAVA");
		
		System.out.println(oldStr);
	}

}
