package sec01.exam06;

import java.util.*;

// 이름을 키 값으로 저장하기
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry수: " + map.size());
		
		//객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동")); //이름(키)으로 정수(값) 검색
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: "+ map.size());
		
		//객체를 하나씩 처리 _ EntrySet으로 처리하는 방법
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		map.clear();
		
		if(map.size()==0) {
			System.out.println("총 Entry 수: " + map.size());
			System.out.println("프로그램 종료");
		}
		
		
		
		
		
	}

}
