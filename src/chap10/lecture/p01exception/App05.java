package chap10.lecture.p01exception;

public class App05 {
	public static void main(String[] args) {
		// ArithmeticException
		
		int i = 5;
		int j = 0;
		
		// 실행예외라서 if로 처리가 가능했음
		// 일반예외는 if로 처리불가
		
		if(j != 0) {
			System.out.println(i / j); // ArithmeticException			
		}
		
		System.out.println("프로그램 실행 계속...");
	}

}
