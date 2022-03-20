package sec01.exam04;

import java.util.*;

public class HahsSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //HashSet의 스트링 set은 equals 문자열 비교를 통해 같은 문자열일 경우 동일한 element(객체)로 인식함
		// 즉 중복 허용안함.
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: "+ size);
		
		// HashSet<String>의 element 출력을 위해서 iterator 인스턴스 생성
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element );
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		//iterator 변수 초기화
		iterator = set.iterator();
		for(String element:set) {
			System.out.println("\t" + element);
		}
		
		set.clear(); // 모든 객체를 제거하고 비움
		if (set.isEmpty()) {
			System.out.println("비어 있음");
		}
		
		
	}

}
