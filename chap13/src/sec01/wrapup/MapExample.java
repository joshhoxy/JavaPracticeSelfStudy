package sec01.wrapup;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		map.put("blue", 96);
		map.put("hong", 92);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		List<Integer> list = new ArrayList();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			list.add(entry.getValue());
		}

		int max=0;
		for(int i=0; i<list.size(); i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		
		int avg = 0;
		int sum=0;
		for(int i=0; i<list.size(); i ++) {
			sum += list.get(i);
			avg = (sum / list.size());
		}
		
		System.out.println("평균 점수: " + avg);
		System.out.println("최고 점수: " + max);
	
	

		}
	
	}
	
	
