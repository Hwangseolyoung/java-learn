package chap13.lecture.p01generic;

import java.util.ArrayList;
import java.util.List;

public class App08 {
	public static void main(String[] args) {
		// ArrayList<E>여러 값을 받을 수 있는데 
		// 그 타입을 타입 파라미터로 받는다.
		// element 추가 add(), 꺼낼때는 get()
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("spring");
		
		String e1 = list1.get(0); // 인덱스값 넣어주기
		String e2 = list1.get(1);
		
		System.out.println(e1);
		System.out.println(e2);
		
		// ArrayList<String>은 List<String>의 하위타입
		List<String> list = list1; 
		// ArrayList<String>은 ArrayList<Object>의 하위타입이 아니다.
//		ArrayList<Object> list3 = list1; 
		
	}

}
