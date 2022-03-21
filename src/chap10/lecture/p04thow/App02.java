package chap10.lecture.p04thow;

public class App02 {
	public static void main(String[] args) {
		try {
			method1(); // NullPointerException 발생 가능한 코드
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 실행 흐름 계속...");
	}
	
	private static void method1() {
		method2(); // NullPointerException 발생 가능한 코드
		System.out.println("메소드1 실행 계속");
	}
	
	private static void method2() {
		method3(); // NullPointerException 발생 가능한 코드
		System.out.println("메소드3 실행 계속");
	}
	
	private static void method3() {
		throw new NullPointerException();
	}
	

}
