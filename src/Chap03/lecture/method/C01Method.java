package Chap03.lecture.method;

public class C01Method {
	public static void main(String[] args) {
		
		System.out.println("명령문 1");
		mymethod();
		System.out.println("명령문 2");
		mymethod(); // 메소드 호출
		
		System.out.println("명령문 3");
	}
	
	// 메소드 정의
	public static void mymethod() {
		System.out.println("마이메소드1");
		System.out.println("마이메소드2");
	}
}
