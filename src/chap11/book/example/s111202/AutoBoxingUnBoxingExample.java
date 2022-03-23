package chap11.book.example.s111202;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// auto boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		
		// 대입시 auto unboxing
		int value = obj;
		System.out.println("value : " + value);
		
		// 연산시 auto unboxing 
		int result = obj + 100;
		System.out.println("result : " + result);
		
	}

}
