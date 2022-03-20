package sec01.exam05;

import java.util.*;

// ¸â¹ö °´Ã¼¸¦ Áßº¹¾øÀÌ ÀúÀåÇÏ´Â HashSet
public class HashSetExample2 {
	public static void main(String[] args) {
		
		Set<Member> memberSet = new HashSet<Member>();
		
		memberSet.add(new Member("È«±æµ¿",30));
		memberSet.add(new Member("È«±æµ¿",30));
		
		System.out.println("ÃÑ °´Ã¼¼ö: " + memberSet.size());
		
	}
}
