package chap15.book.exercise.p9;

import java.util.*;


public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		// 모두 탐색
		// 1. entrySet
		// entry를 set으로 리턴해줌
		// 향상된 for문(셋이 가지고 있는 엘리멘트 타입에 맞는 변수 선언 : 엔드리 셋 메소드)
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}
	
		// 2. keySet
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + "=" + map.get(key));
		}
		
		// 3.forEach
		// 지역 클래스에서는 지역 변수의 값을 변경 할 수 없으니 유의하기.
		// 펑셔널 인터페이스에 2개의 인터페이스를 받는데
		// forEach(k, v) 거기에 키 벨류를 넣어주면 된다.
		map.forEach((k, v) -> System.out.println(k + "=" + v));
		
		// 확인문제 9번 답
		keySet = map.keySet();
		for(String key : keySet) {
			Integer value = map.get(key);
			
			if(value > maxScore) {
				name = key;
				maxScore = value;
			}
			totalScore += value;
		}
		
		System.out.println("평균점수 : " + (totalScore / map.size()));
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수 아이디 : " + name);
	
	
	}

}
