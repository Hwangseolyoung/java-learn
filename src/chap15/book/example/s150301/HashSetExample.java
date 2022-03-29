package chap15.book.example.s150301;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		
		set.add("java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("java");
		set.add("iBATIS");
		
		// 저장된 총 객체 수 얻기
		int size = set.size(); // 변수에 담아서 출력함
		System.out.println("총 객체수 : " + size);
		
		// 반복자 얻기
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) { // 객체 수 만큼 루핑
			String element = iterator.next(); // 한개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		// 한 개의 객체 삭제
		set.remove("JDBC");
		set.remove("iBATIS");
		
		// 저장된 객체 수 얻기
		System.out.println("총 객체수 : " + set.size());
		
		// 반복자 얻기(위에서 메소드 선언함)
		iterator = set.iterator();
		while(iterator.hasNext()) { // 객체 수 만큼 루핑
			String element = iterator.next(); // 한개의 객체를 가져옴
			System.out.println("\t" + element);
		}
		
		// 모든 객체를 제거하고 비움
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
		
	}

}
