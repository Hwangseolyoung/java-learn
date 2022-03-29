package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App10 {
	public static void main(String[] args) {
		// List<List>만들기 : 아이템이 List 타입
		List<List<String>> list = new ArrayList<List<String>>();
		list.add(new ArrayList<String>());
		list.add(new ArrayList<String>());
		list.add(new ArrayList<>()); // 뒤에 <타입> 생략 가능
		
		list.get(0).add("java");
		list.get(0).add("spring");
		list.get(1).add("jimin");
		list.get(1).add("rm");
		list.get(1).add("jin");
		list.get(2).add("spring");
		list.get(2).add("summer");
		
		System.out.println(list);
		// [[java, spring], [jimin, rm, jin], [spring, summer]]
		
		
	}

}
