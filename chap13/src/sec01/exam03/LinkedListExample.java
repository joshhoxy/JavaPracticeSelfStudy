package sec01.exam03;

import java.util.*;

// LinkedList�� ArrayList�� ���� ���� �� add() �޼ҵ� ����
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		System.out.println("ArrayList �� �ڿ��� add ");
		startTime = System.nanoTime();
		for (int i= 0; i<10000; i++) {
			list1.add(String.valueOf(i));
		}		
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð�: " + (endTime - startTime) + "ns");
		System.out.println("");
		
		startTime = System.nanoTime();
		for (int i= 0; i<10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð�: " + (endTime - startTime) + "ns");
 		
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList �ɸ��ð�: " + (endTime - startTime) + "ns");
		
	}

}
