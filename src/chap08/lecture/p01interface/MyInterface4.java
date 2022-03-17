package chap08.lecture.p01interface;

public interface MyInterface4 {
	
	// static method
	// 모두 public
	// 인스턴스를 만들지 않아도 사용 가능함.
	
	// public은 생략가능하다.
	static void method1() {
		System.out.println("스태틱 메소드1");
	}
	
	public static void method2() {
		System.out.println("스태틱 메소드2");
	}

}
