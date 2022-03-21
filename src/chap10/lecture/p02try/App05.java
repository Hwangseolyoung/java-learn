package chap10.lecture.p02try;

public class App05 {
	public static void main(String[] args) {
		int[] arr1 = null;
		
		// catch 블럭 여러개 작성시
		// 다형성에 의해 상위 타입이 처음 작성되어 있으면 
		// 하위 타입은 사용할 수 없다. 
		// 상위타입을 하위타입 아래에 작성한다. 
		
		try {
			int r = arr1[0] / arr1[2];
			
			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println("아리스메틱익셉션 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이인덱스아웃오브바운즈익셉션 발생");
		} catch (RuntimeException e) {
			System.out.println("런타임익셉션 발생");
		}
		
		System.out.println("프로그램 실행 계속");
		
		
	}

}
