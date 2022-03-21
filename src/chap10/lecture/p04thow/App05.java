package chap10.lecture.p04thow;

public class App05 {
	public static void main(String[] args) throws Exception {
		// throws 키워드로 명시하면 프로그램이 종료되고
		// try catch를 사용하면 흐름을 이어간다.
		method1();
		System.out.println("프로그램 실행 계속...");
	}
	
	private static void method1() throws Exception {
		// try catch를 쓰지 않으면 
		// throws 명시해야 함
		method2();
		System.out.println("메소드1 실행 계속...");
		
	}
	
	private static void method2() throws Exception {
		// try catch를 쓰지 않으면 
		// throws 명시해야 함
		method3(); 
		System.out.println("메소드3 실행 계속...");
		
	}
	
	private static void method3() throws Exception {
		throw new Exception();
		
	}

}
