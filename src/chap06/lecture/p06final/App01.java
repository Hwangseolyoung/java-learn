package chap06.lecture.p06final;

public class App01 {
	public static void main(String[] args) {
		// final : 변수 선언시 작성하면 값을 한번만 할당할 수 있음
		// 변하지 않는(고정된) 값을 정의할때 주로 사용됨
		
		int i = 0;
		i = 3;
		
		final int j = 0;
//		j = 1; // xxx
		
		final int k = 0;
//		k = 9; // xxx
//		k = 10; // xxx
		
		method1(3);
		method1(10);
		
		
	}
	
	public static void method1(final int i) {
//		i = 30; // xxx
	}

}
