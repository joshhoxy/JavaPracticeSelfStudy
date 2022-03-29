package sec01.wrapup;

import java.util.*;

public class MapExampleFB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Map.Entry<String, Integer> entry : entrySet) {
			// ★ for문을 돌면서 maxScore와 같이 name도 같이 갱신됨
			if(entry.getValue()>maxScore) {
				name = entry.getKey();
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
		}
		
		int avgScore = totalScore / map.size();
		System.out.println("평균점수: " + avgScore);
		
		System.out.println("최고점수" + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}

}
