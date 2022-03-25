package chap14.lecture.p01lambda;

public class App01 {
	public static void main(String[] args) {
		MyInterface1 o1 = new MyClass1();
		MyInterface1 o2 = new MyInterface() { // 클래스 생성과 인스턴스 생성을 동시에 
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

}

// 익명 클래스 리뷰
interface MyInterface1 {
	void method1();
}

class MyClass1 implements MyInterface1 {
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
}
