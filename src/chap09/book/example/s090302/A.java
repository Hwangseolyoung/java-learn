package chap09.book.example.s090302;

public class A {
	// instance
	int field1;
	void method1() {}
	
	// static
	static int field2;
	static void method2() {}
	
	class B{ // 모든 필드와 메소드에 접근 가능
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C { // 인스턴스 필드와 메소드에 접근 불가
		void method() {
//			field1 = 10;
//			method1();
			
			field2 = 10;
			method2();
		}
	}
	
}
