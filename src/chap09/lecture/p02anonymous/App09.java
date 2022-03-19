package chap09.lecture.p02anonymous;

public class App09 {
	public static void main(String[] args) {
		MyInterface1 o1 = new MyInterface1() {
			@Override
			public void method1() {
				System.out.println("추상 메소드 재정의!!!!");
			}
			
			public void method2() {
				System.out.println("필요해서 만든 메소드");
			}
		};
		
		o1.method1();
//		o1.method2(); // xxx 부모클래스에 존재하는 메소드가 아니라서 사용불가능
	}

}
