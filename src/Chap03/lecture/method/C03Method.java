package Chap03.lecture.method;

public class C03Method {
	public static void main(String[] args) {
		myMethod(300);
		myMethod(900);
//		myMethod(3.14); // x
		myMethod('가');
		
		int j = 999;
		myMethod(j);
	}
	
	public static void myMethod(int i) {
		System.out.println(i);
	}

}
