package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		// set : 순서가 없고, 중복 허용안됨
		// 구현 클래스 : HashSet
		
		Set<String> set =  new HashSet<>();
		
		// add : element 추가
		set.add("jimin");
		set.add("suga");
		set.add("jin");
		set.add("rm");
		
		// size : 크기
		System.out.println(set.size());
		
		// 중복 추가 허용 안됨
		set.add("rm");
		System.out.println(set.size());
		
		// 탐색(인덱스가 없어서 get메소드, for문도 사용불가)
		// 인덱스가 없으므로 향상된 for문만 사용가능
		for(String item : set) {
			// 순서 보장 안됨
			System.out.println(item);
		}
		
		// Iterator 나열해서 탐색함
		// while문과 궁합이 잘맞는다.
		Iterator<String> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// remove 삭제
		set.remove("rm");
		System.out.println(set.size());
		set.remove("winter"); // 없는 것 삭제
		System.out.println(set.size());
		
		// contains가 element가 있는지?(boolean 타입)
		System.out.println(set.contains("rm")); // false
		System.out.println(set.contains("jin")); // true
	}

}
