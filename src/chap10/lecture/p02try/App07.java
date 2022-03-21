package chap10.lecture.p02try;

public class App07 {
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {1, 0};
		try {
			int r = arr1[0] / arr1[2];
			
			System.out.println(r);
			// 서로 상속관계에 있는 타입이 아니라면
			// | 로 여러타입을 참조변수에 catch 할 수 있다.
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("아리스메틱익셉션 또는 널 포인터익셉션 발생");
		}
		
		System.out.println("프로그램 실행 계속");
		
	}
}
