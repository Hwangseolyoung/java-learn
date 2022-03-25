package chap14.lecture.p01lambda;

public class App02 {
	public static void main(String[] args) {
		// 람다식(lambda expression)
		// 추상 메소드만 하나일때만 사용 가능하다.
		// 하나의 메소드를 정의하는 법
		// 메소드 몸통과, 메소드 안에서 사용할 파라미터 목록은 작성해준다.
		MyInterface2 o2 =  (int a, int b) -> { 
			System.out.println(a);
			System.out.println(b);
		};
		
//		MyInterface2 o2 =  new MyInterface2() { // 익명 클래스 구현 코드 작성법
//			@Override
//			public void method1(int a, int b) {
//				System.out.println(a);
//				System.out.println(b);
//			}
//		};
	}
}

interface MyInterface2 {
	void method1(int a, int b);
}
