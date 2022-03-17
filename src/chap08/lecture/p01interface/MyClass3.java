package chap08.lecture.p01interface;

// 구현 클래스(구상 클래스, 구체 클래스) : 인터페이스를 구현한 클래스
// concrete class
public class MyClass3 implements MyInterface3{
	// 구현클래스는 추상 메소드를 가지게된다.
	// 매소드를 구현하지 않으려면 abstract class로 만들어야 한다.

	@Override
	public void method() {
		System.out.println("코드 작성...");
		
	}

	@Override
	public void method2() {
		
	}

	@Override
	public void method3() {
	
	}

	@Override
	public void method4() {
	
	}
	
}
