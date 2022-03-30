package chap15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		// Map : (key, value)쌍으로 저장
		// entry : key + value , 순서가 없음
		// key는 중복 안됨
		// 파라미터에 key, value타입 명시
		Map<String, String> map = new HashMap<>();
		
		// put : entry 추가
		map.put("bts", "boy group");
		map.put("aespa", "girl group");
		map.put("tesla", "car");
		map.put("tesla", "elon musk"); // 키 중복이 안되므로 같은 키 값에 덮어씀
		
		// size : entry 갯수(return Integer)
		int size = map.size();
		System.out.println(size);
		
		// get : key를 사용해서 value를 얻음
		// 타입파라미터로 String을 명시했기에 변수에 담아서 얻기
		String val1 = map.get("bts"); 
		String val2 = map.get("aespa");
		String val3 = map.get("tesla");
		String val4 = map.get("bitcoin");
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4); // 없는 값을 get하면 null로 리턴됨
		
		// keySet : key를 Set타입으로 리턴
		Set<String> keys = map.keySet(); // set은 순서가 보장되지 않는다.
		System.out.println(keys);
		
		// 전체 탐색
		// 1. keySet, get
		Set<String> keyset = map.keySet();
		// 향상된 for문으로(아님 이터레이터 사용하면됨)
		for(String key : keyset) {
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
		// 2. entrySet : set타입을 리턴함
		// set은 Map.entry 타입이고 static이다.
		// Map.entry에는 getKey, getValue 메소드가 있다.
		Set<Map.Entry<String, String>> entries = map.entrySet();
		// 향상된 for문으로(아님 forEach)
		for(Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		// remove : key로 entry삭제
		map.remove("tesla");
		System.out.println(map.size());
		System.out.println(map); // toString 메소드로 안에 내용물 확인
		
		// containsKey : key가 있는지 확인
		System.out.println(map.containsKey("easpa"));
		System.out.println(map.containsKey("teasla"));
		
		
		
		
		
		
		
	}

}
