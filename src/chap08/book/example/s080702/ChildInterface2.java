package chap08.book.example.s080702;

public interface ChildInterface2 extends ParentInterface {
	@Override
	default void method2() {
		// 재정의
	}
	
	public void method3();
}
