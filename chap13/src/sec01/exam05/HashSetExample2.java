package sec01.exam05;

import java.util.*;

// ��� ��ü�� �ߺ����� �����ϴ� HashSet
public class HashSetExample2 {
	public static void main(String[] args) {
		
		Set<Member> memberSet = new HashSet<Member>();
		
		memberSet.add(new Member("ȫ�浿",30));
		memberSet.add(new Member("ȫ�浿",30));
		
		System.out.println("�� ��ü��: " + memberSet.size());
		
	}
}
