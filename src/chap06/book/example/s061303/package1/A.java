package chap06.book.example.s061303.package1;

public class A {
	// 필드
	public int field1;  // public 모두 접근 가능
	int field2;         // package 내에서 접근 가능
	private int field3; // private 클래스 내에서만 접근 가능
	
	// 생성자
	public A() { // 클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
		
	}
	
	// 메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
	

}
