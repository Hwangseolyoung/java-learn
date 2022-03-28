package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App06 {
	public static void main(String[] args) {
		// List 탐색 방법
		List<String> list = new ArrayList<>();
		list.add("spring");
		list.add("java");
		list.add("hello");
		list.add("lunch");
		
		// for
		System.out.println("#그냥 for");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 향상된 for
		System.out.println("#향상된 for");
		for(String element : list) { 
			System.out.println(element);
		}
		
		// foreach 
		System.out.println("#foreach");
		list.forEach(e -> System.out.println(e)); // 람다식
		
		// Iterator : 인터페이스 제네릭 타입 
		System.out.println("#Iterator");
		Iterator<String> iter = list.iterator();
		// has Next() while문과 잘 맞는다.
		// 다음 탐색할 객체가 있으면 리턴해주고 커서를 옮겨줌
		while(iter.hasNext()) {
			// next() 다음 탐색할 객체가 있는지
			System.out.println(iter.next());
		}
		
		
	}

}
