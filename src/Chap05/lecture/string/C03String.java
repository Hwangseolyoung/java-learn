package Chap05.lecture.string;

public class C03String {
	public static void main(String[] args) {
		// 객체는 각각 자기의 메소드를 가지고 있다.
		String s1 = "spring";
		String s2 = "java";
		String s3 = "우크라이나";
		
		// 문자열 길이 구하기
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		// charAt(int) : 파라미터로 받은 인덱스의 문자(char) 리턴
		// 리턴 타임은 캐릭터 타입(char)
		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(0));
		System.out.println(s3.charAt(0));
		
		System.out.println(s1.charAt(s1.length() - 1));
		System.out.println(s1.charAt(s2.length() - 1));
		System.out.println(s1.charAt(s3.length() - 1));
		
		// equals(Object):파라미터로 받은 객체와 이 객체의 문자열을 비교한다.
		// 같으면 true, 다르면 false
		String s4 = "spr";
		String s5 = "ing";
		String s6 = s4 + s5;
		System.out.println(s1); // spring
		System.out.println(s6); // spring
		System.out.println(s1 == s6); //false
		System.out.println(s1.equals(s6)); //true
		
		// indexOf(String):파라미터로 받은 문자열이 처음 발견된 위치(index)를 리턴
		String s7 = "이 책을 통해 무엇을 배울 수 있죠";
		System.out.println(s7.indexOf("책을")); // 2
		System.out.println(s7.indexOf("을")); // 3
		System.out.println(s7.indexOf("자바")); // -1(없으면)
		
		// substring(int, int) : 이 문자열의 부분 문자열을 리턴한다.(띄어쓰기 포함됨)
		// 1. 시작 인덱스, 2.종료 인덱스 (ex.7까지 리턴하고 싶으면 8입력하기)
		// 하나의 파라미터를 받거나 두개의 파라미터를 받는다. 
		System.out.println(s7.substring(8, 11)); // 무엇을
		System.out.println(s7.substring(12, 16)); // 배울 수
		
		// substring(int) : 이 문자열의 부분 문자열을 리턴한다.
		// 문자열의 끝까지 리턴됨
		System.out.println(s7.substring(8)); // 무엇을 배울 수 있죠
		System.out.println(s7.substring(12)); // 배울 수 있죠
		
	}

}
