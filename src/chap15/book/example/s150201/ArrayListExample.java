package chap15.book.example.s150201;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// String 객체를 저장
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database"); // 2번 index로 위치 지정해줌
		list.add("iBATIS");
		
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();
		
		// 2번 인덱스의 객체 얻기
		String skill = list.get(2);
		System.out.println("2 : " + skill);
		System.out.println();
		
		// 저장된 총 객체 수 만큼 루핑
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();
		
		// 2번 인덱스(Database) 객체 삭제됨
		list.remove(2);
		
		// 2번 인덱스(Servlet/JSP) 객체 삭제됨
		list.remove(2);
		
		// 저장된 총 객체 수 만큼 루핑
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str );
		}
	}

}
