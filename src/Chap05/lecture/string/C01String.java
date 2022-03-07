package Chap05.lecture.string;

public class C01String {
	public static void main(String[] args) {
		// string 참조타입
		
		String s1 = new String("java"); // 새로운 인스턴스 생성(참조변수 생성)
		String s2 = new String("java"); // s2도 참조변수
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2); // 참조값을 비교하므로 false
		
		System.out.println(s1.equals(s2)); // equals 메소드를 이용하면 문자열을 비교 true 
		
		
		// 스트링을 리터럴 값으로 사용하면 그 값을 재사용한다.
		// 그러므로 s3, s4의 참조값이 동일하다
		// 요기서 많은 실수가 나올 수 있으므로 주의해야 한다.
		
		String s3 = "java";
		String s4 = "java";
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 == s4); 
		
		
	}

}
