package chap09.lecture.p01nested;

public class MyClass3 {
	// static 멤버에서는 instance 멤버에 접근할 수 없다.
	
	// static 중첩 클래스
	static class NestedClass1 {
		
	}
	
	// instance 중첩 클래스
	class NestedClass2 {
		
	}
	
	// instance 메소드
	void method1() {
		// 내부 클래스 인스턴스 생성시 클래스명 생략 가능
//		MyClass3.NestedClass1 o1 = new NestedClass1();
		NestedClass1 o1 = new NestedClass1();
		NestedClass2 o2 = new NestedClass2();
		
	}
	
	// static 메소드
	static void method2() {
		NestedClass1 o1 = new NestedClass1();
		NestedClass2 o2 = new NestedClass2(); // instance 중첩 클래스 접근 불가
	}
	
	// instance 필드
	NestedClass1 field1 = new NestedClass1();
	NestedClass2 field2 = new NestedClass2();
	
	// static 필드
	static NestedClass1 field3 = new NestedClass1();
	static NestedClass2 field4 = new NestedClass2(); // instance 중첩 클래스 접근 불가
	
	
}
