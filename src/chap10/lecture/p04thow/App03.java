package chap10.lecture.p04thow;

public class App03 {
	public static void main(String[] args) {
		method1();
		
		System.out.println("프로그램 실행 계속...");
	}
	
	private static void method1() {
		method2();
		
		System.out.println("메소드1 실행 계속...");
		
	}
	
	private static void method2() {
		
		try { // throws Exception 명시된 메소드에 try catch 써줘야 함
			method3(); // Exception이 발생 할 수 있는 코드
		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("메소드3 실행 계속...");
		
	}
	
	private static void method3() throws Exception {
		
		// throw를 발생시킨 메소드에서는 try catch를 쓰지 않고
		// throws Exception을 명시해 준다.
		throw new Exception();
		
	}

}
