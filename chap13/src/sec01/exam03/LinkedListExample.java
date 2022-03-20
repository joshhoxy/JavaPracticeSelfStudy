package sec01.exam03;

import java.util.*;

// LinkedList와 ArrayList의 실행 성능 비교 add() 메소드 사용시
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		System.out.println("ArrayList 맨 뒤에서 add ");
		startTime = System.nanoTime();
		for (int i= 0; i<10000; i++) {
			list1.add(String.valueOf(i));
		}		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + "ns");
		System.out.println("");
		
		startTime = System.nanoTime();
		for (int i= 0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + "ns");
 		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + "ns");
		
	}

}
