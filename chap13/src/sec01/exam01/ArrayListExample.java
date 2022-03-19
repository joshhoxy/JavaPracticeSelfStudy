package sec01.exam01;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("ÃÑ °´Ã¼¼ö: "+ size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();
		
		for ( int i =0; i <size; i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);	
		}
		System.out.println();
		
		System.out.println("2¹øÂ° ÀÎµ¦½º Á¦°Å");
		list.remove(2);
		printArray(list);
		
		System.out.println("2¹øÂ° ÀÎµ¦½º Á¦°Å");
		list.remove(2);
		printArray(list);
		
		System.out.println("iBATIS °´Ã¼ Á¦°Å");
		list.remove("iBATIS");
		printArray(list);
		
	}
	
	public static void printArray(List<String> list) {
		for ( int i =0; i <list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);		
		}
	}
}
