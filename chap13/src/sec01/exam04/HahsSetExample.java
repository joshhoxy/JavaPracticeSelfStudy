package sec01.exam04;

import java.util.*;

public class HahsSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //HashSet�� ��Ʈ�� set�� equals ���ڿ� �񱳸� ���� ���� ���ڿ��� ��� ������ element(��ü)�� �ν���
		// �� �ߺ� ������.
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü��: "+ size);
		
		// HashSet<String>�� element ����� ���ؼ� iterator �ν��Ͻ� ����
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element );
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü��: " + set.size());
		
		//iterator ���� �ʱ�ȭ
		iterator = set.iterator();
		for(String element:set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // ��� ��ü�� �����ϰ� ���
		if (set.isEmpty()) {
			System.out.println("��� ����");
		}
		
		
	}

}
