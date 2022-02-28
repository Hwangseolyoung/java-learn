package Chap03.lecture.method;

public class C04Method {
	public static void main(String[] args) {
//		myMethod1(); // 값을 넣어줘야 한다.
//		myMethod1(3); // 파라미터의 값을 하나만 넣을수 없다.
		myMethod1(3, 5);
		myMethod1(33, 55);
		myMethod1('가', 33);
		
		myMethod2(999, 888);
		
	}
	
	public static void myMethod1(int i, int j) {
		System.out.println(i);
		System.out.println(j);
		
	}
	
	// 파라미터명 : lowerCamelCase
	public static void myMethod2(int age, int height) {
		System.out.println(age * 2);
		System.out.println(height * 2);
		
	}
	
	public static void myMethod3(int i, boolean b, long l, double d) {
	
	}
}
