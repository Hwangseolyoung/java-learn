package chap14.book.exercise.p4;

import java.util.function.IntSupplier;

public class LambdaExample {
	public static int method(int x, int y) {
		IntSupplier supplier = () -> {
//			 x *= 10; // 지역변수 값을 변경할 수 없다.
			 int result = (x * 10) + y;
			 return result;
			 
			 // 한줄로 작성가능함
//			 IntSupplier supplier = () -> (x * 10) + y;
		};
		
		int result = supplier.getAsInt();
		return result;
		
		}
	
	public static void main(String[] args) {
		System.out.println(method(3, 5));
	
	}

}
