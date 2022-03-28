package chap15.lecture.p01list;

import java.util.List;
import java.util.ArrayList;

public class App04 {
	// List : 순서가 있고, 중복 허용됨
	// 구현 클래스 ArrayList, Vector, LinkdList
	
	public static void main(String[] args) {
		// 제네릭 타입 <타입명>
		List<String> list1 = new ArrayList<String>();
		
		// element 추가
		list1.add("jim"); // index 0
		list1.add("v"); // index 0
		list1.add("jungkuk"); // index 0
		
		// element 탐색
		String s1 = list1.get(0);
		String s2 = list1.get(1);
		String s3 = list1.get(2);
//		String s4 = list1.get(3); // Exception 발생
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// element 변경
		list1.set(0, "suga");
		System.out.println(list1);
		
		// element 삭제(지우면 한칸씩 옮겨진다)
		list1.remove(1);
		System.out.println(list1);
		System.out.println(list1.get(1));
		
		
	}

}
