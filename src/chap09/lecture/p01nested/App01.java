package chap09.lecture.p01nested;

public class App01 {
	public static void main(String[] args) {
		// 인스턴스 생성
		MyClass1 o1 = new MyClass1(); 
		
		// 인스턴스 중첩클래스 생성자 사용
		MyClass1.NestedClass1 o3 = o1.new NestedClass1();
		
		// 정적 멤버 중첩클래스는 인스턴스 생성 없이 접근 가능
		// 클래스명.내부글래스명 
		MyClass1.NestedClass2 o2 = new MyClass1.NestedClass2();
		
	}

}
